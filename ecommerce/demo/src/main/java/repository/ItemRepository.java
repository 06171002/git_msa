package repository;

import domain.Item;
import repository.test.Repository;

import static repository.ConnectionConst.*;

import java.sql.*;
import java.util.Optional;
import java.util.Scanner;

public class ItemRepository implements Repository<Item> {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    @Override
    public void save(Item item) throws SQLException {

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        int price = sc.nextInt();
//        String manufact_date = sc.next();
//        String origin = sc.next();
//        String company = sc.next();
//        String size = sc.next();
//        String color = sc.next();

        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("insert into item(name,price,manufact_date,origin,company,size,color) values (?,?,?,?,?,?,?)");
        pstmt.setString(1,item.getName());
        pstmt.setInt(2,item.getPrice());
        pstmt.setString(3,item.getDateOfMenufac());
        pstmt.setString(4,item.getOrigin());
        pstmt.setString(5,item.getCompany());
        pstmt.setString(6,item.getSize());
        pstmt.setString(7,item.getColor());

        close(conn,pstmt,rs);
    }

    @Override
    public Optional<Item> findById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        pstmt = conn.prepareStatement("select * from cartitem");
        rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.println("""
                        item_id = %d name = %s price = %d manufact_date = %s origin = %s company = %s size = %s color = %s
                        """.formatted(
                    rs.getInt("item_id"),
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getString("manufact_date"),
                    rs.getInt("origin"),
                    rs.getString("company"),
                    rs.getString("size"),
                    rs.getString("color")));
        }
        close(conn,pstmt,rs);
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("delete from item where id =?");
        pstmt.setLong(1, id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

//    @Override
//    public void update() throws SQLException {
//        conn = DriverManager.getConnection(URL,USER,PASSWORD);
//        pstmt = conn.prepareStatement("update item set name");
//
//    }

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
