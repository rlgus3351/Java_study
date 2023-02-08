package javaproject;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오.
		// 단. 최대단위는 10000원, 최소 단위는 100원
		
		// 0. 키보드 입력을 받기 위한 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");

		// 1. 잔돈 입력하여 변수 Change에 넣기
		int change = sc.nextInt();

		// 2. 잔돈 출력하기
		System.out.println("잔돈 : " + change + "원");

		// 3. 10000원, 5000원, 1000원, 500원, 100원 으로 나눠주기
		int[] array = { 10000, 5000, 1000, 500, 100 };
		for (int i = 0; i < array.length; i++) {
			if (change / array[i] > 0) {// 잔돈 / 지페,동전으로 나눈 값이 0보다 크면
				// 4.출력
				// 10000원 : change/10000 + 개
				// 5000원 : change/5000 + 개
				// 1000원 : change/1000 + 개
				// 500원 : change/500 + 개
				// 100원 : change/100 + 개

				System.out.println(array[i] + "원 : " + change / array[i] + "개");
				change %= array[i];
				// 큰 지폐를 우선순위로 나머지 연산을 한 금액은 다시 change 변수에 저장하여 나머지 지폐, 동전으로 나눠준다.
			}
		}
		sc.close();
	}

}
