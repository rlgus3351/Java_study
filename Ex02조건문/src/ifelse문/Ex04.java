package ifelse문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 1. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. "상품의 개수를 입력하세요 " 출력물
		System.out.print("상품의 개수를 입력하세요 : ");
		
		// 3. 입력받은 상품의 개수를 변수로 받기
		int num = sc.nextInt();
		
		// 4. 전역변수 price 설정
		int price = 0;
		
		// 5. 조건문이 참일 때 10%할인된 금액 개당 9000원
		//    조건문이 거짓일 때 원래 가격 개당 10000원
		if (num>=11) {
			price = 9000 * num;
		} else {
			price = 10000 * num;
		}
		// 6. 계산된 금액 출력
		System.out.println("가격은 " + price + "원 입니다.");
		sc.close();
	}

}
