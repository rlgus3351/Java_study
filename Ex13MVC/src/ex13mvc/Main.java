package ex13mvc;

import java.util.ArrayList;
import java.util.Scanner;

import model.memberDAO;
import model.memberDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 디자인 패턴 : 계속해서 같은 문제가 발생하여, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분

		System.out.println("======================SHRD 회원관리 프로그램======================");
		while (true) {
			System.out.print("[1]회원 가입 [2]로그인 [3]전체회원목록 [4] 회원정보 수정 [5]회원탈퇴 [6]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 회원가입
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("전화 번호 입력 : ");
				String tel = sc.next();

				memberDAO dao = new memberDAO();
				int row = dao.join(id, pw, name, tel);
				if (row > 0) {
					System.out.println("회원 가입 성공!!!");
				} else {
					System.out.println("회원 가입 실패!!!");
				}

			} else if (choice == 2) {
				// 로그인
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// 로그인 메소드 사용

				memberDAO dao = new memberDAO();

				memberDTO dto = dao.login(id, pw);

				// 로그인 성공 유무 판단.
				if (dto != null) {
					System.out.println("로그인 성공.");
					System.out.printf("%s님 환영합니다~\n", dto.getName());
				} else {
					System.out.println("아이디나 비밀번호를 다시 확인해주세요.");
				}
			} else if (choice == 3) {
				// 전체회원목록

				// 회원 전체 목록 가져오기 ---> DAO의 매서드 형태로 정의
				memberDAO dao = new memberDAO();
				ArrayList<memberDTO> user = dao.user();
				// 가져온 데이터 출력

				// 열이름 출력
				System.out.println("ID \t PW\t NAME \t TEL");
				for (int i = 0; i < user.size(); i++) {
					System.out.print(user.get(i).getId() + "\t");
					System.out.print(user.get(i).getPw() + "\t");
					System.out.print(user.get(i).getName() + "\t");
					System.out.print(user.get(i).getTel() + "\t");
					System.out.println();
				}
			} else if (choice == 4) {
				// 회원정보 수정
				System.out.println("====회원 정보 수정====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				System.out.print("수정할 이름 입력 : ");
				String updateName = sc.next();
				System.out.print("수정할 전화번호 입력 : ");
				String updateTel = sc.next();

				memberDAO dao = new memberDAO();
				// view - model 사이에 데이터를 주고 받을 때는 dto를 활용해서 받자.

				// 사용자로 받아온 데이터를 DTO객체를 통해 묶기
				memberDTO dto = new memberDTO(id, pw, updateName, updateTel);
				int row = dao.update(dto);
				if (row > 0) {
					System.out.println("회원정보 수정 성공");
				} else {
					System.out.println("아이디와 비밀번호를 확인하세요.");
				}

			} else if (choice == 5) {
				// 회원탈퇴
				System.out.print("id 입력 : ");
				String id = sc.next();

				System.out.print("pw 입력 : ");
				String pw = sc.next();
				memberDTO dto = new memberDTO(); // ------> DTO 기본 생성자를 통해 setter 메소드를 사용하여 값을 집어넣어준다.
				dto.setId(id);
				dto.setPw(pw);
				memberDAO dao = new memberDAO();
				int row = dao.delete(dto);
				if (row > 0) {
					System.out.println("회원 정보 삭제 성공");
				} else {
					System.out.println("아이디와 비밀번호를 다시 입력하세요.");
				}

			} else if (choice == 6) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				// 다른 숫자 입력시
				System.out.println("다시입력하세요.");
			}
		}

	}

}
