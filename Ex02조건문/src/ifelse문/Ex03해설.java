package ifelse문;

import java.util.Scanner;

public class Ex03해설 {

	public static void main(String[] args) {

		// 1.Scanner 가져오기 
		Scanner sc = new Scanner(System.in);
		
		// 2. "나이를 입력하세요 : " 출력
		System.out.print("나이를 입력하세요 : ");
		
		// 3. 나이를 입력받아서 변수에 담기
		int age = sc.nextInt();
		
		// 4. "인원수를 입력하세요 : " 출력
		System.out.print("인원 수를 입력하세요 : ");
		
		// 5. 인원수를 입력받아서 변수에 담기
		int num = sc.nextInt();
		
		// 만약 나이가 20살 이상이라면 --> 인당 5000원
		//     나이가 20살 이상이 아니라면 --> 인당 2500원   
		// 총 ~~원입니다. 출력
		
		int price = 0; 
		
		if ( age>=20 ) {
			// 총 가격 : 5000원 * 인원수 
			price = 5000 * num;
		} else {
			// 인당 2500원
			price = 2500 * num;
		}
		System.out.println("총 " + price + "원 입니다.");
		sc.close();

	}

}
