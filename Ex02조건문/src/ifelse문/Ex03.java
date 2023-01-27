package ifelse문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1. 에버랜드 환영문 출력
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		
		// 2. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 3. "나이를 입력하세요. " 출력물 가져오기
		System.out.print("나이를 입력하세요 : ");
		
		// 4. 입력 받은 나이를 보관할 int형 변수 지정
		int age = sc.nextInt();
		
		// 5. "인원수를 입력하세요. " 출력물 가져오기		
		System.out.print("인원수를 입력하세요 : ");
		
		//6. 입력 받은 인원수를 보관할 int형 변수 지정
		int num = sc.nextInt();
		int price = 0;
		//7. 20세 미만 50%할인 적용
		if (age<20) {
			//9. 가격 변수를 지정
			price = 5000 * num;
		} else {
			price = 2500 * num;
		}
		System.out.println("총 " + price +"원 입니다.");
		sc.close();
	}

}
