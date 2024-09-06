package repository;

import common.OrderStatus;
import domain.Order;

import java.sql.*;
import java.util.List;
import java.util.Optional;

import static repository.connection.DBConnectionUtil.close;
import static repository.connection.DBConnectionUtil.getConnection;

public class OrderRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save(Order order) throws SQLException {

        conn = getConnection();
        pstmt = conn.prepareStatement("insert into orders(date, totalPrice, status, member_id) values (?,?,?,?,?,?,?)");
        pstmt.setString(1,order.getDate());
        pstmt.setInt(2,order.getTotalPrice());
        pstmt.setObject(3,order.getStatus());
        pstmt.setLong(4,order.getMemberId());
        pstmt.execute();
        close(conn,pstmt,rs);

    }

    public List<Order> findAll() throws SQLException {

        conn = getConnection();
        pstmt = conn.prepareStatement("select * from orders");
        rs = pstmt.executeQuery();

        List<Order> list = null;
        while (rs.next()){
            Order orders = new Order(
                    rs.getString("date"),
                    rs.getInt("totalPrice"),
                    rs.getObject("status",OrderStatus.class),
                    rs.getLong("memberId")
            );
            list.add(orders);
        }
        close(conn,pstmt,rs);
        return list;
    }

    public Optional<Order> findById(Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("select * from orders where id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();
        Order orders = null;
        if (rs.next()) {
            orders = new Order(
                    rs.getString("date"),
                    rs.getInt("totalPrice"),
                    rs.getObject("status", OrderStatus.class),
                    rs.getLong("memberId")
            );
        }
        close(conn,pstmt,rs);
        return Optional.of(orders);
    }

    public List<Order> findMemberId(Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("select * from orders where member_id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();

        List<Order> list = null;
        while (rs.next()){
            Order orders = new Order(
                    rs.getString("date"),
                    rs.getInt("totalPrice"),
                    rs.getObject("status",OrderStatus.class),
                    rs.getLong("memberId")
            );
            list.add(orders);
        }
        close(conn,pstmt,rs);
        return list;
    }


    public void updateById(String status, Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("update orders " +
                " status = ? " +
                "where id = ?");
        pstmt.setString(1,status);
        pstmt.setLong(2,id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public void deleteById(Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("delete from orders where id =?");
        pstmt.setLong(1, id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }
}
