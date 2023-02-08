package javaproject;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 숫자를 입력받아 3의 배수인 숫자를 출력하는 프로그램을 작성하세요.
		// 0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 1. 입력받을 수를 담을 변수를 사전에 선언
		int num = 0;
		// 2. 10번째 정수까지 입력해야하므로 int형이고 길이가 10인 배열 result로 선언
		int[] result = new int[10];
		// 3. 반복문을 이용하여 10번진행한다.
		for (int j = 0; j < 10; j++) { // for_Start
			// j+1번째 정수를 입력하여 변수 num에 저장하고
			System.out.print((j + 1) + "번째 정수 입력 >> ");
			num = sc.nextInt();
			if (num % 3 == 0) { // num이 3의 배수일시 result배열에 저장한다.
				result[j] = num;
			}
		} // for_End
		System.out.print("3의 배수 : ");
		for (int i = 0; i < result.length; i++) { // for_Start
			if (result[i] > 0) {// result배열에는 값이 3으로 나누어진 수와 기본형인 0이 들어있는데 우리가 원하는건 3으로 나누어 떨어진 수이므로 0보다 큰값을
								// 출력하면된다.
				System.out.print(result[i] + " ");
			}
		} // for_End
	}
}
