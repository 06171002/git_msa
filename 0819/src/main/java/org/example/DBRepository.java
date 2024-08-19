package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBRepository {
    public void insert() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력");
        String name = sc.next();
        System.out.println("나이 입력");
        int age = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/aaa","root","1234");
            pstmt = conn.prepareStatement("insert into aaa (name,age) values (?,?)");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.executeUpdate();
        }catch (Exception e){
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

    public void select() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/aaa","root","1234");
            pstmt = conn.prepareStatement("select * from aaa");
            rs = pstmt.executeQuery();

            while (rs.next()){
//                int a = rs.getInt("id");
//                String b = rs.getString("name");
//                String c = rs.getString("age");
//                System.out.print("id = " + a +" ");
//                System.out.print("name = " + b +" ");
//                System.out.println("age = " + c);
                System.out.println("""
                        id = %d name = %s age = %d
                        """.formatted(rs.getInt("id"),rs.getString("name"),rs.getInt("age")));
            }

        }catch (Exception e){
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

    public void update() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/aaa","root","1234");
            pstmt = conn.prepareStatement("update aaa set name = ?, age = ? where id = ?");
            String name = sc.next();
            int age = sc.nextInt();
            int id = sc.nextInt();
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
        }catch (Exception e){
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

    public void delete() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/aaa","root","1234");
            pstmt = conn.prepareStatement("delete from aaa where id = ?");
            int id = sc.nextInt();
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }catch (Exception e){
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
