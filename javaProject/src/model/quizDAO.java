package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class quizDAO {
	// 중복으로 선언되고 있는 변수들을 --> DAO의 필드
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;

	// --------------------------------------------------
	// 중복으로 작성되고 있는
	// driver 동적로딩 ~ 연결 생성 --> 메서드로 빼기
	public void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
			String user_id = "cgi_3_0131_3";
			String user_pw = "smhrd3";

			conn = DriverManager.getConnection(url, user_id, user_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// --------------------------------------------------------
	// 중복으로 발생하는 close 코드 빼내기
	public void close() {

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
	// --------------------------------------------------------------

	// 문제 가져오기 메소드

	public ArrayList<quizDTO> getQuiz(int quizNo) {

		ArrayList<quizDTO> questionList = new ArrayList<>();

		try {
			getConn();// 위에 만들어 놓은 연결 메서드로 대체

			String sql = "select * from quiz_table where quiz_no = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setLong(1, quizNo);

			rs = psmt.executeQuery();

			while (rs.next()) {
				if (rs.getString("Shape").equals("width"))
					questionList.add(new quizDTO(true, rs.getString("answer"), rs.getInt("yindex"), rs.getInt("xindex"),
							rs.getString("quiz")));
				else
					questionList.add(new quizDTO(false, rs.getString("answer"), rs.getInt("yindex"),
							rs.getInt("xindex"), rs.getString("quiz")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return questionList;

	}
	// -------------------------------------------------end of get quiz

	// 크기를 받고 ※로 초기화된 2차원 배열 생성 + ▦으로 테두리 생성
	public String[][] makeArray(int size) {
		String[][] arr = new String[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i == 0 && j == 0) || (i == arr.length - 1 && j == 0))
					arr[i][j] = "ㅤ";
				else if (j == 0 || i == 0 || j == arr[i].length - 1 || i == arr.length - 1)
					arr[i][j] = "▦";
				else
					arr[i][j] = "※";
			}
		}
		return arr;
	}
	// ------------------------------------------배열 생성 끝

	// 문제와 배열을 주면 문제 정답 자리를 "ㅤ"로 표시
	public String[][] makeVoid(String[][] arr, quizDTO qus) {

		for (int i = 0; i < qus.getAnswer().length(); i++) {
			if (qus.isAcross())
				arr[qus.getRow()][qus.getColumn() + i] = "ㅤ";
			else
				arr[qus.getRow() + i][qus.getColumn()] = "ㅤ";
		}

		return arr;
	}
	// ------------------------------------------------정답 자리 표시 끝

	// -------------------------------------------------문제번호와 문제를 받아서 십자말풀이 판 리턴
	public String[][] makeBroad(int quizNo, ArrayList<quizDTO> questionList) {
		// 문제판 크기 구하기 + 문제판 배열 만들기 // 테두리때문에 크기에 2를 더함
		int boradSize = 0;
		if (quizNo / 10 < 1)
			boradSize = 5 + 2;
		else if (quizNo / 100 < 1)
			boradSize = 7 + 2;
		else if (quizNo / 1000 < 1)
			boradSize = 10 + 2;
		else
			System.out.println("error - 문제 번호가 너무 큽니다");

		String[][] gameBorad = this.makeArray(boradSize);

		// 문제판에 문제 자리 구멍뚫기
		for (int i = 0; i < questionList.size(); i++) {
			gameBorad = this.makeVoid(gameBorad, questionList.get(i));
		}

		return gameBorad;
	}
	// -------------------------------------------------------- 십자말풀이 판 생성 완료

	// 정답을 맞췄을 시 답 자리에 정답 표시
	public String[][] putAnswer(String[][] arr, quizDTO qus) {
		for (int i = 0; i < qus.getAnswer().length(); i++) {
			if (qus.isAcross())
				arr[qus.getRow()][qus.getColumn() + i] = qus.getAnswer().substring(i, i + 1);
			else
				arr[qus.getRow() + i][qus.getColumn()] = qus.getAnswer().substring(i, i + 1);
		}

		return arr;
	}
	// -------------------------------------------정답 표시 끝

}
