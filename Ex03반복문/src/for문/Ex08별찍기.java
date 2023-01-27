package for문;

import java.util.Scanner;

public class Ex08별찍기 {

	public static void main(String[] args) {

		// 사용자로부터 정수를 입력받아
		// 만약 5를 입력받으면
		// *****로 출력하면 된다.
		// 0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 1. 사용자 입력하라고 출력해주기
		System.out.print("정수를 입력하세요 : ");
		// 2. 입력받은 값 변수에 저장
		int num = sc.nextInt();
		// 3. 입력받은 숫자 만큼 *표 찍기.
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		sc.close();
	}

}
