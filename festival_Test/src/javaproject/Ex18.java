package javaproject;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 8자리 정수를 입력받아 반복문을 활용하여 입력받은 정수의 합을 구하여 출력하는 프로그램을 작성하시오.
		// 0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 1. 정수입력 출력문과 입력받은 정수 변수에 저장하기
		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		// 2.10000000자리부터 1의자리까지 나눠야 하므로 해당 값들을 배열 array에 저장한다.
		int[] array = { 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1 };

		// 3. 입력받은 정수를 담을 변수 저장
		int[] num = new int[8];
// --------------------------------------배열 num에 나누어 떨어지는 값 넣기----------------------------------//
		// 4. 반복문
		for (int i = 0; i < array.length; i++) { // for_Start
			if (n / array[i] > 0) { // 입력받은 변수 n이 array배열의 어느 인덱스로 나누어 떨어지면
				// 3. 출력
				num[i] = n / array[i]; // num[i]인덱스에 입력받은 변수 / 자리수[i]의 값으로 나눈 값을 넣어주고
				n %= array[i]; // 해당 변수로 나눈 나머지는 n으로 다시 저장
			}
		} // for_End
//--------------------------------------배열 num의 값 더하여 출력하기----------------------------------//
		int sum = 0; // 정수형 변수 sum으로 인덱스별로 더한 값을 저장할 변수 0으로 초기화
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum + "입니다.");
	}
}
