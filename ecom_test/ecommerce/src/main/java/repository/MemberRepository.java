package repository;

import common.Role;
import domain.Member;

import java.sql.*;
import java.util.List;
import java.util.Optional;

import static repository.connection.ConnectionConst.*;
import static repository.connection.DBConnectionUtil.close;
import static repository.connection.DBConnectionUtil.getConnection;

public class MemberRepository {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save(Member member) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("insert into item(username, password, name, birth, phone, email, address, home, role) " +
                "values (?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1,member.getUsername());
        pstmt.setString(2,member.getPassword());
        pstmt.setString(3,member.getName());
        pstmt.setString(4,member.getBirth());
        pstmt.setString(5,member.getPhone());
        pstmt.setString(6,member.getEmail());
        pstmt.setString(7,member.getAddress());
        pstmt.setString(8,member.getHome());
        pstmt.setObject(9,member.getRole());
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public List<Member> findAll() throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("select * from MEMBER");
        rs = pstmt.executeQuery();

        List<Member> list = null;
        while (rs.next()){
            Member member = Member.of(
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("birth"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("home"),
                    rs.getObject("role", Role.class)
            );
            list.add(member);
        }
        close(conn,pstmt,rs);
        return list;
    }

    public Optional<Member> findById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        pstmt = conn.prepareStatement("select * from MEMBER where id = ?");
        pstmt.setLong(1,id);
        rs = pstmt.executeQuery();
        Member member = null;
        if (rs.next()) {
            member = Member.of(
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("birth"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("home"),
                    rs.getObject("role",Role.class)
            );
        }
        close(conn,pstmt,rs);
        return Optional.of(member);
    }

    public void deleteById(Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("delete from MEMBER where id =?");
        pstmt.setLong(1, id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }

    public void updateById(Member member, Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("update MEMBER " +
                "set username = ?, password = ?, name = ?, birth = ?, phone = ?, email = ?, address = ?, home = ?, role = ? " +
                "where id = ?");
        pstmt.setString(1,member.getUsername());
        pstmt.setString(2,member.getPassword());
        pstmt.setString(3,member.getName());
        pstmt.setString(4,member.getBirth());
        pstmt.setString(5,member.getPhone());
        pstmt.setString(6,member.getEmail());
        pstmt.setString(7,member.getAddress());
        pstmt.setString(8,member.getHome());
        pstmt.setObject(9,member.getRole());
        pstmt.setLong(10,id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }

    public Optional<Member> findByUsername(String username) {
        return null;
    }
}
