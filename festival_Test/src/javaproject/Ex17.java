package javaproject;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 . 정수 n을 입력받아 1,2,4,7,11과 같은 수열의 n번째 항까지 출력하세요.
		// 1 2 4 7 11 16 22
		// + 1 2 3 4 5 6

		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 정수 입력 출력문과 입력 받은 점수 변수에 저장하기.
		System.out.println("n 입력 : ");
		int num = sc.nextInt();
		int cnt = 1;
		// i만 증가하여 i는 더해지는 값이고, cnt에 cnt+i를 더한값을 저장해준다.
		for (int i = 0; i < num; i++) {// for_Start
			cnt = cnt + i; // cnt의 값에 i를 더하여 넣어준다.
			System.out.print(cnt + " "); // cnt값출력
		} // for_End

	}

}
