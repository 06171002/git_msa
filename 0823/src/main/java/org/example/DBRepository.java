package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {



    public void insert() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
            System.out.println("연결성공");
            pstmt = conn.prepareStatement("insert into mem (name,age) values (?,?)");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            }catch (Exception e){

            }

        }


    }
}
