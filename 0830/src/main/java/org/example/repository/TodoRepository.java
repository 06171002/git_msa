package org.example.repository;

import org.example.domain.Todo;
import org.example.service.Main;
import static org.example.repository.connection.DBConnectionUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoRepository {

    public List<Todo> select() {
        List<Todo> list = new ArrayList<>();
        try{
            forName();
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from todo");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Todo todo = new Todo(
                        rs.getInt("id"),
                        rs.getObject("dodate", LocalDateTime.class),
                        rs.getString("content"),
                        rs.getInt("member_id")
                );
                list.add(todo);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        list.stream().forEach(System.out::println);
        return list;
    }
    public List<Todo> todoFindById(int id) {
        List<Todo> list = new ArrayList<>();

        try {
            forName();
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from todo where member_id = ?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Todo todo = new Todo(
                        rs.getInt("id"),
                        rs.getObject("dodate",LocalDateTime.class),
                        rs.getString("content"),
                        rs.getInt("member_id")
                );
                list.add(todo);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        list.stream().forEach(System.out::println);
        return list;
    }

    public void insert() {
        if (Main.member == null){
            System.out.println("로그인하셔야 합니다.");
            return;
        }
//        LocalDateTime mydate = LocalDateTime.now();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/MEMBER","root","1234")){
            Class.forName("com.mysql.cj.jdbc.Driver");

            PreparedStatement pstmt = conn.prepareStatement("insert into todo(dodate,content,member_id) values (?,?,?)");

            pstmt.setObject(1, LocalDate.of(2024,9,10));
            pstmt.setString(2,"공부");
            pstmt.setInt(3, Main.member.getId());

            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("변경된 할일");
        String content = sc.next();
        int id = sc.nextInt();

        try {
            forName();
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("update todo set content = ? where member_id = ?");
            pstmt.setString(1,content);
            pstmt.setInt(2,id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try{
            forName();
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from todo where id = ?");
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
