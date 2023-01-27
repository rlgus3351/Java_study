package switch문;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		//스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 잔돈 입력 칸 만들기
		System.out.print("금액을 입력하세요 : ");
		
		// 입력받은 잔돈 변수로 받기
		int money = sc.nextInt();
		
		//메뉴 소개, 메뉴 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 아우터(700원) | 2. 이구동성(1000원) | 3.에그몽(500원) |  >>>>>>>> " );
		
		//메뉴 번호 받기
		int num = sc.nextInt();
		// 지역변수 : 지정된 영역이 제한된 변수
		// 전역변수 : 전체에서 사용 가능한 변수
		int change = 0;
		
		if (num == 1 ) {
			change = money - 700;
		}else if(num == 2 ) {
			change = money -1000;
		}else if(num == 3) {
			change = money - 500;
		}else if(num>3) {
			System.out.println("해당 메뉴가 없습니다.");
		}else {
			System.out.println("돈이 부족합니다.");
		}
		System.out.println( "잔돈 : " + change + "원" );
		sc.close();	
	}
}
