package repository;

import repository.connection.DBConnectionUtil;
import domain.Member;
import domain.Review;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 이 부분이 connection을 import하는 부분
import static repository.connection.DBConnectionUtil.getConnection;

public class ReviewRepository {

    // 리뷰보기
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Review> list = new ArrayList<>();

        try{
            conn = getConnection(); //커넥션 반환
            pstmt = conn.prepareStatement("select * from review");
            rs = pstmt.executeQuery();

            while(rs.next()){
                Review review = new Review(
                        rs.getLong("reviewId"),
                        rs.getInt("star"),
                        rs.getString("contents"),
                        rs.getString("date"),
                        rs.getLong("member_id"),
                        rs.getLong("item_id")
                );
                list.add(review);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 리뷰작성
    public void insert(Review review){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 리뷰아이디(순번)나 회원아이디 제품 아이디는 자동으로???
        try{
            conn = getConnection();
            LocalDateTime localDate = LocalDateTime.now();
            pstmt = conn.prepareStatement(
                    "insert into review(stars,contents,date) values(?, ?, ?)");
            pstmt.setInt(1, review.getStar());
            pstmt.setString(2, review.getContents());
            pstmt.setObject(3, localDate);
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

    // 리뷰수정
    public void update(Review review){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = getConnection();
            LocalDateTime localDateTime = LocalDateTime.now();
            pstmt = conn.prepareStatement("update review set stars=?, contents=?, date=? where reviewId=?");

            pstmt.setLong(4, review.getReviewId());
            pstmt.setInt(1, review.getStar());
            pstmt.setString(2, review.getContents());
            pstmt.setObject(3, localDateTime);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 리뷰삭제
    public void delete(Long reviewId){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = getConnection();
            pstmt = conn.prepareStatement("delete from review where review_id=?");
            pstmt.setLong(1, reviewId);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
