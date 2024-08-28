package repository;

import repository.test.Repository;

import java.sql.*;
import java.util.Optional;

public class CartItemRepository {


    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;




    public void select() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc.mysql:localhost:3307/ecommerce","root","1234");
            pstmt = conn.prepareStatement("select * from cartitem");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("""
                        id = %d total_price = %d quantity = %d cart_id = %d item_id = %d
                        """.formatted(
                                rs.getInt("id"),
                                rs.getInt("total_price"),
                                rs.getInt("quantity"),
                                rs.getInt("cart_id"),
                                rs.getInt("item_id")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close(conn,pstmt,rs);


        }

    }

    private static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null){
                pstmt.close();
            }
            if (conn != null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
