package repository;

import domain.Member;



import static repository.connection.ConnectionConst.*;
import static repository.connection.DBConnectionUtil.getConnection;


import java.sql.*;
import java.util.List;
import java.util.Optional;

public class MemberRepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void save() throws SQLException {
        conn = getConnection();
        pstmt = conn.prepareStatement("insert into MEMBER ");
    }

    public List<Member> findAll() {}

    public Optional<Member> findById(Long id) {}

    public void deleteById(Long id) {}
}
