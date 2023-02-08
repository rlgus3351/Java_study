package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class userDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	userDTO dto = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";

			// jdbc:oracle:thin --> protocol
			// @localhost --> 서버주소, @IP주소
			// :1521 --> port number : 1525
			// : xe --> DB 이름
			String user_id = "cgi_3_0131_3";
			String user_pw = "smhrd3";
			conn = DriverManager.getConnection(url, user_id, user_pw);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//------------------------------------------------------------------DB종료 메소드-----------------------------------------------------------//
	public void endConn() {
		// 위에서 예외 상황이 발생하더라도 반드시 한번은 들어오는 구간
		// 6. DB 연결 종료 -----> 자원 반납
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//------------------------------------------------------------------회원가입 메소드-----------------------------------------------------------//
	public int join(String id, String pw, String birth_date) {

		int row = 0;
		try {

			getConn();
			String sql = "insert into user_id values(?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, birth_date);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			// 예외상황 발생 시 내용을 출력해준다.
			e.printStackTrace();
		} finally {
			endConn();

		}
		return row;

	}

//------------------------------------------------------------------로그인 메소드------------------------------------------------------------//
	public userDTO login(String id, String pw) {

		try {

			getConn();
			String sql = "select * from user_id where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				String uid = rs.getString("id");
				String upw = rs.getString("pw");
				String ubirth_date = rs.getString("Birth_date");
				dto = new userDTO(uid, upw, ubirth_date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endConn();

		}
		return dto;
	}
//------------------------------------------------------------------로그인 중복체크------------------------------------------------------------//
	
	public userDTO userCheck(String id) {
		try {

			getConn();
			String sql = "select * from user_id where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();
			if (rs.next()) {
				String uid = rs.getString("id");
				String upw = rs.getString("pw");
				String ubirth_date = rs.getString("Birth_date");
				dto = new userDTO(uid, upw, ubirth_date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endConn();

		}
		return dto;
	}
	
}
