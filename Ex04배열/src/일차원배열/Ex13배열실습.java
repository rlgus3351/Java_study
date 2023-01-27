package 일차원배열;

import java.util.Scanner;

public class Ex13배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 레퍼런스 변수 생성시 초기값이 들어간다.
		// 정수, 실수 배열 경우 -> 0이 들어간다.
		// 문자 배열인 경우 -> 빈칸이 들어간다.
		// boolean 배열 -> false가 들어간다.
		// 레퍼런스 배열 -> null값이 들어간다.

		// 회원가입, 로그은 프로그램

		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		String[] id = new String[3]; // 회원들의 아이디가 저장될 변수
		String[] password = new String[3]; // 회원들의 비밀번호가 저장될 변수
		int sum = 0;

		// 최대로 가입가능한 회원 수는 3명
		// 무한 반복문
		while (true) {
			System.out.print("[1] 회원 가입 [2] 로그인 [3] 종료 >> ");
			int choice = sc.nextInt();
			// 문제. 입력받은 아이디와 비밀번호를 위의 배열 안에 넣어
			// 회원가입을 시키시오
			// 단. 최대 회원가입 가능한 수는 3명입니다.
			// 힌트. 현재 회원이 몇명 가입되어있는 지 알 수 있는 변수가 필요.

			if (choice == 1) {// 회원 가입
				System.out.println("===회원 가입===");
				System.out.print("아이디를 입력하세요 >>");
				String UserId = sc.next();
				System.out.print("비밀번호를 입력하세요 >>");
				String UserPw = sc.next();

				if (sum < 3) {
					id[sum] = UserId;
					password[sum] = UserPw;
					sum++;
					System.out.println("가입 성공");
				} else {
					System.out.println("회원이 초과되어 가입할수 없습니다.");
				}
				// 문제. 아이디와 비밀번호 일치하는 회원이 있으면
				// "로그인에 성공했습니다" 출력
				// 아이디에 비밀번호 일치하는 회원이 없으면
				// "로그인에 실패했습니다" 출력

			} else if (choice == 2) {// 로그인구문

				System.out.println("===로그인===");
				System.out.print("아이디를 입력하세요 >>");
				String inputId = sc.next();
				System.out.print("비밀번호를 입력하세요 >>");
				String inputPw = sc.next();
				boolean isCheck = true;

				for (int i = 0; i < sum; i++) {//인덱스 번호 0~길이까지 반복문
					if (inputId.equals(id[i]) && inputPw.equals(password[i])) { //입력된 아이디 비밀번호가 사용자 아이디 인덱스[i] 칸에 증가되면서 맞는 값을 찾는다.
						System.out.println("로그인 되었습니다.");
						isCheck = false; //불리언 타입인 isCheck 변수를 통해 로그인 실패 출력물을 줘야하므로 불리언타입 변수에 false값을 넣어준다.
					}
				}
				if (isCheck) {
					System.out.println("로그인 실패했습니다.");
				}

			} else if (choice == 3) {// 종료구문
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}
