package repository;

import domain.Item;
import domain.OrderItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static repository.connection.DBConnectionUtil.*;

public class OrderItemRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public List<OrderItem> findAll() {
        return null;
    }

    public List<OrderItem> findByUsername() {



        return null;
    }

    public List<OrderItem> findByOrderId(Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("select * from orderitem where order_id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();

        List<OrderItem> list = null;
        while (rs.next()) {
            OrderItem orderItemId = new OrderItem(
                    rs.getLong("order_item_id"),
                    rs.getInt("quantity"),
                    rs.getInt("price"),
                    rs.getLong("order_id"),
                    rs.getLong("item_id")
            );
            list.add(orderItemId);

        }
        close(conn,pstmt,rs);
        return list;
    }
}
