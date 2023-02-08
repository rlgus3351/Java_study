package test;

import java.util.ArrayList;
import java.util.Scanner;

public class memberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======SMHRD 회원관리 프로그램=======");
		memberDAO dao = new memberDAO();
		memberDTO dto = new memberDTO();

		while (true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 전체회원목록 [4] 회원정보 수정 [5] 종료 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 회원 가입
				System.out.println("====회원가입====");
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("PW 입력 :");
				String pw = sc.next();
				System.out.print("NICK 입력 :");
				String nick = sc.next();
				dao.mList.add(new memberDTO(id, pw, nick));

			} else if (choice == 2) {
				// 로그인
				System.out.println("====로그인====");
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("PW 입력 :");
				String pw = sc.next();
				// dao리스트 사이즈로 반복문 횟수를 지정하여 ID와 PW가 맞는 데이터 찾기, 맞으면 해당하는 인덱스의 닉네임으로 가져와서 출력문띄어주기

				for (int i = 0; i < dao.mList.size(); i++) {
					if (dao.mList.get(i).getId().equals(id) && dao.mList.get(i).getPw().equals(pw)) {
						System.out.println(dao.mList.get(i).getNick() + "님 환영합니다.");
					}
				}

			} else if (choice == 3) {
				// 전체 회원 목록 조회
				System.out.println("=====전체회원목록=====");

				// dao리스트 사이즈 반복문 횟수를 지정하여 만들었던 dto.toString 메소드를 통하여 dao.mList.get(i)
				// memberDTO의 반환 값으로 넣어주기
				for (int i = 0; i < dao.mList.size(); i++) {
					System.out.println((i + 1) + "번 " + dto.toString(dao.mList.get(i)));
					;
					// 이전 출력 확인 코드
//					System.out.printf("%d번 %s/%s/%s\n", (i + 1), dao.mList.get(i).getId(), dao.mList.get(i).getPw(),
//							dao.mList.get(i).getNick());
				}

			} else if (choice == 4) {
				// 회원 정보 수정
				System.out.println("====회원정보수정====");
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("PW 입력 :");
				String pw = sc.next();
				System.out.print("수정할 NICK 입력 :");
				String afterNick = sc.next();
				// dao리스트 사이즈로 반복문 횟수를 지정하여 ID와 PW가 맞는 데이터 찾아, 닉네임 값을 수정할 값으로 채워주기 성공시 출력문 띄어주기
				for (int i = 0; i < dao.mList.size(); i++) {
					if (dao.mList.get(i).getId().equals(id) && dao.mList.get(i).getPw().equals(pw)) {
						dao.mList.get(i).setNick(afterNick);
						System.out.println("수정 성공");
					}

				}

			} else if (choice == 5) {
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				// 1~5 그 외의 숫자 입력시 출력문
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}
