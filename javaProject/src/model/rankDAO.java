package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class rankDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	userDTO dto = null;
	ResultSet rs = null;

//------------------------------------------------------------------DB연결 메소드-----------------------------------------------------------//
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

//------------------------------------------------------------------랭킹 삽입 메소드-----------------------------------------------------------//
	public int rankInsert(String id, int level_No, String time) {
		int row = 0;
		try {

			getConn();
			String sql = "insert into rank_table values(?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setInt(2, level_No);
			psmt.setString(3, time);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			// 예외상황 발생 시 내용을 출력해준다.
			e.printStackTrace();
		} finally {
			endConn();

		}
		return row;

	}

	// ------------------------------------------------------------------랭킹 조회
	// 메소드-----------------------------------------------------------//
	public ArrayList<rankDTO> selectAll(int level_no) {

		ArrayList<rankDTO> rankDto = new ArrayList<rankDTO>();

		try {
			// 2) 드라이버 동적 로딩

			getConn();
			String sql = "select * from rank_table where level_no= ? and rownum <=5 order by TIME ";
			

			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, level_no);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String uid = rs.getString("id");
				int uscore = rs.getInt("level_No");
				String utime = rs.getString("time");
				rankDto.add(new rankDTO(uid, uscore, utime));

			}

		} catch (Exception e) {
			// 반드시 넣어 줘야한다.
			e.printStackTrace(); // 에러를 콘솔창에 출력
		} finally {
			endConn();

		}
		return rankDto;
	}
}
