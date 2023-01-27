package 단순if문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1.스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. "정수를 입력하세요."를 출력
		System.out.print("정수를 입력하세요 : ");
		
		// 3. 정수를 입력받아 변수에 담기
		int num = sc.nextInt();
		
		// 4. 만약 3의 배수이고,
		//    5의 배수 라면 "3과 5의 배수입니다." 출력하기
		// 3과 5의 배수 두 가지 조건을 만족하면 참 (AND)
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}
		sc.close();

	}

}
