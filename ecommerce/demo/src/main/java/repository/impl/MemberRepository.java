package repository.impl;

import domain.Member;
import common.Role;

import static repository.connection.ConnectionConst.*;
import static repository.connection.DBConnectionUtil.close;
import static repository.connection.DBConnectionUtil.getConnection;

import java.sql.*;
import java.util.List;
import java.util.Locale;
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
        pstmt.setString(9,member.getRole());
        pstmt.executeUpdate();

        close(conn,pstmt,rs);

    }

    public List<Member> findAll() throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("select * from MEMBER");
        rs = pstmt.executeQuery();

        List<Member> list = null;
        while (rs.next()){
            Member member = new Member(
                    rs.getString("name"),
                    rs.getString("birth"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("loginId"),
                    rs.getString("password"),
                    rs.getString("home"),
                    rs.getString("role")
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
             member = new Member(
                    rs.getString("name"),
                    rs.getString("birth"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("roginId"),
                    rs.getString("password"),
                    rs.getString("home"),
                    rs.getString("role")
            );
        }
        close(conn,pstmt,rs);
        return Optional.of(member);
    }

    public void deleteById(Long id) throws SQLException {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        pstmt = conn.prepareStatement("delete from MEMBER where id =?");
        pstmt.setLong(1, id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }

    public void updateById(Member member, Long id) throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("update MEMBER " +
                "set name = ?, birth = ?, phone = ?, email = ?, address = ?, loginId = ?, password = ?, home = ?, role = ? " +
                "where id = ?");
        pstmt.setString(1,member.getName());
        pstmt.setString(2,member.getBirth());
        pstmt.setString(3,member.getPhone());
        pstmt.setString(4,member.getAddress());
        pstmt.setString(5,member.getLoginId());
        pstmt.setString(6,member.getPassword());
        pstmt.setString(7,member.getHome());
        pstmt.setString(8,member.getRole());
        pstmt.setLong(9,id);
        pstmt.executeUpdate();

        close(conn,pstmt,rs);
    }
}
