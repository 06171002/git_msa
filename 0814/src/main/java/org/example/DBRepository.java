package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {

    public void insert() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("이름입력");
            String name = sc.next();
            System.out.println("나이입력");
            int age = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/aaa","root","1234");
            System.out.println("연결성공");
            PreparedStatement pstmt = conn.prepareStatement("insert into aaa (name,age) values (?,?)");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void select() {
        System.out.println("select");
    }
}
