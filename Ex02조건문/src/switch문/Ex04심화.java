package switch문;

import java.util.Scanner;

public class Ex04심화 {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 잔돈 입력 칸 만들기
		System.out.print("잔돈을 입력하세요 : ");
		// 입력받은 잔돈 변수로 받기
		int change = sc.nextInt();
		// 메뉴 소개, 메뉴 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3.에그몽(500원) >>>>>>>> ");
		// 메뉴 번호 받기
		int num = sc.nextInt();
		String menu = "";

		if (num == 1 && change >= 700) {
			change = change - 700;
			menu = "아우터";
		} else if (num == 2 && change >= 1000) {
			change = change - 1000;
			menu = "이구동성";
		} else if (num == 3 && change >= 500) {
			change = change - 500;
			menu = "에그몽";
		} else if (num > 3) {
			System.out.println("해당 메뉴가 없습니다.");
		} else {
			System.out.println("돈이 부족합니다.");
		}

		System.out.println("잔돈은 " + change + "원 남았습니다.");
		sc.close();

	}

}
