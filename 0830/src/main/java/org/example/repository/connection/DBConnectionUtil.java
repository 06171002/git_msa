package org.example.repository.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import static org.example.repository.connection.ConnectionUtil.*;

public class DBConnectionUtil {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static Class forName() throws ClassNotFoundException {
        return Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
