package forStudy;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 6. 한 개의 자연수를 입력 받아 그 수의 배수를
		// 차례로 10개 출력하는 프로그램을 작성하시오

		// 0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 1. 자연수를 입력하시오 출력문
		System.out.print("자연수를 입력하세요 : ");
		// 2. 입력받은 자연수를 담는 변수 생성
		int num = sc.nextInt();
		// 3. 조건문 작성
		// 입력받은 수의 배수를 차례로 10개 출력
		for (int i = 1; i <= 10; i++) { // 차례대로 10개 출력하고 배수이기 때문에 초기값을 1로 해서 입력받은 수가 나올 수 있게 설정
			int result = i * num; // 결과 값을 저장하기 위해 정수형 타입의 result를 선언 후 i와 num 의 곱을 지정해준다.
			System.out.print(result + " ");
		}
		sc.close(); // 열어준 스캐너 닫아주기!

	}

}
