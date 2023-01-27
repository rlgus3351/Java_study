package do_while문;

import java.util.Scanner;

public class Ex02로그인프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while로 만들었던 프로그램을
		// do-while로 변경해서 작성하시오

		// 로그인 프로그램
		String login_id = "rlgus3351"; // 로그인 id 설정
		String login_pw = "1234"; // 로그인 pw 설정
		String id = ""; // 입력받을 id 변수 지정
		String pw = ""; // 입력받을 pw 변수 지정

		Scanner sc = new Scanner(System.in); // 스캐너 가져오기
		do {
			System.out.println("----로그인 프로그램----");
			System.out.print("아이디를 입력하세요 : ");
			id = sc.next();
			System.out.print("비밀번호를 입력하세요 : ");
			pw = sc.next();
			if (login_id.equals(id) && login_pw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패...");
			}
		} while (true);

		sc.close();
	}

}
