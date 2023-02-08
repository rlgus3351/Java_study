package javaproject;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제. 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		// 예시) 행 개수 : 5
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");

		// 0. 키보드 입력을 받기 위해 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 1. 행 개수 입력칸 출력과 행 개수 입력 변수에 담기
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		// 2. for문으로 별찍기.
		for (int i = 1; i <= num; i++) {// for_Start
			// 1~입력받은 변수까지 1씩 증가하여 반복
			for (int j = 1; j <= i; j++) {
				// 1부터 i의 값까지 증가하여 반복
				System.out.print("*");
				// 별개수 출력
			}
			System.out.println();
		} // for_end
	}

}