package while문;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 로그인 프로그램
		// 키보드 값 입력 받기

		// 고정된 아이디 비밀번호
		String login_id = "rlgus";
		String login_Pw = "1234";

		
		// 문제.
		// 로그인 실패 시 에는 로그인에 성공할때 까지 계속해서 아이디와 비밀번호 입력
		// 로그인 성공 시 에는 프로그램은 종료.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----로그인 프로그램----");
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			
			// 문자열끼리 같은지 비교하기 위해서는
			// ==이 아닌 문자열.equals(비교값) 을 사용한다.
			
			if(login_id.equals(id) && login_Pw.equals(pw)) {
				System.out.println("로그인 성공!!!");
				break;
			}else {
				System.out.println("로그인 실패...");
			}
		}
		System.out.println("----프로그램을 종료합니다.----");
		sc.close();
		
	}

}
