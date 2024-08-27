package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDBRepository {

    public List<Member> select(){
        List<Member> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/MEMBER","root","1234");
            pstmt = conn.prepareStatement("select * from test");
            System.out.println("연결성공");


            rs = pstmt.executeQuery();

            while (rs.next()){
                Member member = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password")
                );
//                System.out.println(member);
                list.add(member);
            }




        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return list;

    }


}
