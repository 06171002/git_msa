package repository.impl;

import domain.Orders;

import java.sql.*;
import java.util.List;
import java.util.Optional;

import static repository.connection.ConnectionConst.*;
import static repository.connection.DBConnectionUtil.close;
import static repository.connection.DBConnectionUtil.getConnection;

public class OrderRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save(Orders order) throws SQLException {

        conn = getConnection();
        pstmt = conn.prepareStatement("insert into orders(date, totalPrice, status, member_id) values (?,?,?,?,?,?,?)");
        pstmt.setString(1,order.getDate());
        pstmt.setInt(2,order.getTotalPrice());
        pstmt.setString(3,order.getStatus());
        pstmt.setLong(4,order.getMember_id());
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public List<Orders> findAll() throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("select * from orders");
        rs = pstmt.executeQuery();

        List<Orders> list = null;
        while (rs.next()){
            Orders orders = new Orders(
                    rs.getString("date"),
                    rs.getInt("totalPrice"),
                    rs.getString("status"),
                    rs.getLong("member_id")
            );
            list.add(orders);
        }
        close(conn,pstmt,rs);
        return list;
    }

    public Optional<Orders> findById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        pstmt = conn.prepareStatement("select * from orders where id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();
        Orders orders = null;
        if (rs.next()) {
            orders = new Orders(
                    rs.getString("date"),
                    rs.getInt("totalPrice"),
                    rs.getString("status"),
                    rs.getLong("member_id")
            );
        }
        close(conn,pstmt,rs);
        return Optional.of(orders);
    }

    public void updateById(Orders orders,Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("update orders " +
                "date = ?, totalPrice = ?, status = ?, member_id = ?" +
                "where id = ?");
        pstmt.setString(1,orders.getDate());
        pstmt.setInt(2,orders.getTotalPrice());
        pstmt.setString(3,orders.getStatus());
        pstmt.setLong(4,orders.getMember_id());
        pstmt.setLong(5,id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public void deleteById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("delete from orders where id =?");
        pstmt.setLong(1, id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }


}
