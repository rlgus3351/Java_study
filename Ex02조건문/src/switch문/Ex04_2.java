package switch문;

import java.util.Scanner;

public class Ex04_2 {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 잔돈 입력 칸 만들기
		System.out.println("잔돈을 입력하세요 : ");
		// 입력받은 잔돈 변수로 받기
		int money = sc.nextInt();
		
		// 메뉴 소개, 메뉴 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3.에그몽(500원) >>>>>>>> ");
		// 메뉴 번호 받기
		int num = sc.nextInt();
		int change = money;
		
		if (num == 1) {
			if(money>=700) {
				change = money - 700;	
			}else {
				//내가 입력한 금액이 메뉴의 금액보다 작을 때
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else if (num == 2) {
			if(money>=1000) {
				change = money - 1000;	
			}else {
				//내가 입력한 금액이 메뉴의 금액보다 작을 때
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else if (num == 3) {
			if(money>=500) {
				change = money - 500;
			}else {
				//내가 입력한 금액이 메뉴의 금액보다 작을 때
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else if (num > 3) {
			System.out.println("해당 메뉴가 없습니다.");
		} else {
			System.out.println("돈이 부족해요 ㅠㅠ");
			
		}
		System.out.println("잔돈 : " + change + "원");
		sc.close();
	}

}
