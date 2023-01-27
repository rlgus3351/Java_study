package 일차원배열;

import java.util.Random;
import java.util.Scanner;

public class Ex10배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아침, 점심, 저녁 메뉴 랜덤 뽑기

		// 키보드 입력 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 랜덤 가져오기
		Random r = new Random();
		int num = 0;
		// 아침, 점심, 저녁 메뉴 배열에 사전 생성
		String[] brackfast = { "시리얼", "떡국", "김밥", "라면", "계란토스트" };
		String[] lunch = { "제육 볶음", "초밥", "덮밥", "햄버거", "도시락" };
		String[] dinner = { "순두부찌개", "매운탕", "김치찌개", "피자", "삼겹살구이" };

		// 4번을 누르기 전까지는 반복이 되어야 한다.
		// while(true)무한 반복문을 실행하고 4번을 눌렀을 때 break;걸어주기
		while (true) {
			System.out.println("식사를 선택해주세요 : "); // 메뉴 선택칸 출력하기
			System.out.print("1.아침 | 2.점심 | 3.저녁 | 4.종료 >>");
			int choice = sc.nextInt(); // 키보드로 입력받은 숫자 choice에 저장하기.
			if (choice == 1) {
				System.out.println("======오늘의 추천 아침 메뉴======"); // 아침 메뉴 설명칸 출력
				String menu = brackfast[r.nextInt(brackfast.length)];
				// 아침메뉴 배열에 숫자를 정해주기 위해서 random값을 0~brackfast.length만큼 0~4까지 난수 뽑아 해당 난수에 대해서 아침 배열에 인덱스 값으로 넣어주어 메뉴 출력.
				System.out.println(menu); 
				System.out.println();

			} else if (choice == 2) {
				System.out.println("======오늘의 추천 점심 메뉴======"); // 점심 메뉴 설명칸 출력
				num = r.nextInt(lunch.length);// 점심 메뉴 배열에 숫자를 정해주기 위해서 위에랑 똑같은 작업.
				String menu = lunch[num];	
				System.out.println(menu); // 랜덤 난수를 사용하여 점심 배열에 인덱스 값으로 넣어주어 메뉴 출력
				System.out.println();

			} else if (choice == 3) {
				System.out.println("======오늘의 추천 저녁 메뉴======"); // 저녁 메뉴 설명칸 출력
				num = r.nextInt(dinner.length); // 저녁 메뉴 배열에 숫자를 정해주기 위해서 위에랑 똑같은 조건
				String menu = dinner[num];
				System.out.println(menu); // 랜덤 난수를 사용하여 배열에 인덱스 값으로 넣어주어 메뉴를 출력한다.
				System.out.println();

			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		}
		sc.close();

	}

}
