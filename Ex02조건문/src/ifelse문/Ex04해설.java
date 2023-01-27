package ifelse문;

import java.util.Scanner;

public class Ex04해설 {

	public static void main(String[] args) {

		// 1. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. "상품의 개수를 입력하세요 : " 출력
		System.out.print("상품의 개수를 입력하세요 : ");
		
		// 3. 상품 갯수를 입력받아서 변수에 담기
		int num = sc.nextInt();
		int price = 0;
		// 4. 만약 상품 갯수가 11개 이상이라면 --> 10% 할인
		//    만약 상품 갯수가 11개 이상이 아니라면 --> 정가
		//    가격은 ~~원 입니다. 출력
		if (num >= 11) {
			// 10% 할인된 가격으로 계산
			// 명시적 형변환이 사칙연산보다 계산 우선순위가 높아서 강제로 계산하게 괄호를 쳐준다.
			price = (int)(0.9 * 10000 * num);
			
		} else {
			// 정가로 계산
			price = num * 10000;
		}
		System.out.println("가격은 " + price + "원 입니다.");
		sc.close();
	}

}
