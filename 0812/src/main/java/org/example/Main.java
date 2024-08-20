package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
            PreparedStatement pstmt = conn.prepareStatement("create table test (aa varchar(255), bb varchar(255))");
//            PreparedStatement pstmt1 = conn.prepareStatement("create table test2 (aa varchar(255), bb varchar(255))");

            pstmt.executeUpdate();
//            pstmt1.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}