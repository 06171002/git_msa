package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/MEMBER","root","1234")){
            Class.forName("com.mysql.cj.jdbc.Driver");

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
                        rs.getObject("regdate",LocalDate.class),
                        rs.getObject("mydate",LocalDateTime.class)
                );

                list.add(member);
            }

            list.stream().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}