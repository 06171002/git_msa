package repository.impl;

import common.Role;
import domain.Item;
import domain.Member;


import static repository.connection.ConnectionConst.*;
import static repository.connection.DBConnectionUtil.close;
import static repository.connection.DBConnectionUtil.getConnection;


import java.sql.*;
import java.util.List;
import java.util.Optional;

public class MemberRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save(Member member) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("insert into item(name, birth, phone, email, address, loginId, password, home, role) " +
                "values (?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1,member.getName());
        pstmt.setString(2,member.getBirth());
        pstmt.setString(3,member.getPhone());
        pstmt.setString(4,member.getEmail());
        pstmt.setString(5,member.getAddress());
        pstmt.setString(6,member.getLoginId());
        pstmt.setString(7,member.getPassword());
        pstmt.setString(8,member.getHome());
        pstmt.setString(9,member.getRole().name());
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public List<Member> findAll() throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("select * from MEMBER");
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

    public Optional<Member> findById(Long id) {}

    public void deleteById(Long id) {}
}
