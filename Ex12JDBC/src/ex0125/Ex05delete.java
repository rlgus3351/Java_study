package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05delete {

	public static void main(String[] args) {
		// 회원 탈퇴 기능
		// 아이디와 비밀번호가 일치하는 경우에만 회원 탈퇴 할 수 있게 프로그램을 만드시오
		// delete big_member where id = ? and pw = ?

		// 1. 사용자로부터 ID,PW 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("id 입력 : ");
		String id = sc.next();

		System.out.print("pw 입력 : ");
		String pw = sc.next();

		// 2. ID,PW가 DB에 있는 저장된 정보와 일치하는지 체크해주기

		// 1) try - catch 구문
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {

			// 2) 드라이버 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3) DB 연결 통로 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 4) SQL문 준비
			String sql = "delete big_member where id = ? and pw = ?";

			// 5) 실행 준비 상태 만들기
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 6) 실행
			// executeUpdate() : DML(INSERT, UPDATE, DELETE)
			// --> 결과가 몇 행 변경 일어났는가?
			// executeQuery() : select문을 실행 할때 사용.
			// ResultSet 타입으로 리턴된다.
			// ResultSet도 마지막에 닫아주어야 한다.
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원 정보 삭제 성공");
			} else {
				System.out.println("아이디와 비밀번호를 다시 입력하세요.");
			}

		} catch (Exception e) {
			// 반드시 넣어 줘야한다.
			e.printStackTrace(); // 에러를 콘솔창에 출력
		} finally {
			try {
				// 8) 사용했던 객체들 담기 (나중에 만들어진 순서대로)
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
