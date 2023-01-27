package for문;

import java.util.Scanner;

public class Ex04for문실습3 {
	public static void main(String[] args) {
		// 0. Scanner 추가
		Scanner sc = new Scanner(System.in);

		// 1. 사용자로 부터 정수 하나 입력
		System.out.print("변수를 입력하세요 : ");

		// 2. 그 정수를 num 변수에 저장
		int num = sc.nextInt();
		// 3. 출력
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.print(result + " ");

		}
	}

}
