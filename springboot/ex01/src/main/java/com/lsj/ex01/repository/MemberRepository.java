package com.lsj.ex01.repository;



import com.lsj.ex01.domain.Member;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.lsj.ex01.repository.connection.DBConnectionUtil.*;


@Component
public class MemberRepository {

    public List<Member> select() {
        List<Member> list = new ArrayList<>();

        try (Connection conn = getConnection()){
            forName();
            PreparedStatement pstmt = conn.prepareStatement("select * from test order by id desc");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
//                Member member = Member.builder()
//                        .id(rs.getInt("id"))
//                        .name(rs.getString("name"))
//                        .age(rs.getInt("age"))
//                        .email(rs.getString("email"))
//                        .password(rs.getString("password"))
//                        .regdate(rs.getObject("regdate", LocalDate.class))
//                        .mydate(rs.getObject("mydate", LocalDateTime.class))
//                        .build();
                Member member = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getObject("regdate", LocalDate.class),
                        rs.getObject("mydate", LocalDateTime.class)
                );

                list.add(member);
            }

            list.stream().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void insert(String name, int age) {
        LocalDateTime mydate = LocalDateTime.now();
            try (Connection conn = getConnection()){
                forName();
                PreparedStatement pstmt = conn.prepareStatement("insert into test(name,age,email,password,mydate) values (?,?,?,?,?)");
                pstmt.setString(1,name);
                pstmt.setInt(2,age);
                pstmt.setString(3,"asdf");
                pstmt.setString(4,"1234");
                pstmt.setObject(5,mydate);

                pstmt.executeUpdate();

            }catch (Exception e){
                e.printStackTrace();
            }
    }

    public void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int id = sc.nextInt();

        try {
            forName();
            conn = getConnection();
            pstmt = conn.prepareStatement("update test set name = ?, age = ? where id = ?");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 사용자 존재 유무 확인
    public Member findById(int id) {
        //        List<Member> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            forName();
            conn = getConnection();
            pstmt = conn.prepareStatement("select * from test where id = ?");
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();

            if (rs.next()){
                return Member.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .email(rs.getString("email"))
                        .build();
//                Member member = new Member(
//                        rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getString("email"));
//                list.add(member);
            }else {
                return null;
            }

//            list.stream().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void deleteById(int id) {
        try{
            forName();
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from test where id = ?");
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
