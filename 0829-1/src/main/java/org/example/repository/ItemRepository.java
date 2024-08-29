package org.example.repository;

import org.example.domain.Item;

import static org.example.repository.connection.ConnectionConst.*;
import static org.example.repository.connection.DBConnectionUtil.close;
import static org.example.repository.connection.DBConnectionUtil.getConnection;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ItemRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save(Item item) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = getConnection();
        pstmt = conn.prepareStatement("insert into item(name,price,manufac_date,origin,company,size,color) values (?,?,?,?,?,?,?)");
        pstmt.setString(1,item.getName());
        pstmt.setInt(2,item.getPrice());
        pstmt.setString(3,item.getDateOfMenufac());
        pstmt.setString(4,item.getOrigin());
        pstmt.setString(5,item.getCompany());
        pstmt.setString(6,item.getSize());
        pstmt.setString(7,item.getColor());
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }

    public List<Item> findAll() throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("select * from item");
        rs = pstmt.executeQuery();

        List<Item> list = null;
        while (rs.next()){
            Item item = new Item(
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getString("dateOfMenufac"),
                    rs.getString("origin"),
                    rs.getString("company"),
                    rs.getString("size"),
                    rs.getString("color")
            );
            list.add(item);
        }
        close(conn,pstmt,rs);
        return list;
    }

    public Optional<Item> findById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        pstmt = conn.prepareStatement("select * from item where id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();
        Item item = null;
        if (rs.next()) {
            item = new Item(
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getString("dateOfMenufac"),
                    rs.getString("origin"),
                    rs.getString("company"),
                    rs.getString("size"),
                    rs.getString("color")
                    );
        }
        close(conn,pstmt,rs);
        return Optional.of(item);
    }

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

}
