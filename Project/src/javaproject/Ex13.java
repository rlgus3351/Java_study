package javaproject;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 정수를 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력하시오.

		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		// 0.정수 n을 입력 받기--> 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// 1.정수입력 출력문 및 입력받은 변수 num에 저장
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 인덱스 값에 넣어줄 값 초기에 1로 선언.
		int cnt = 1;
		// num = 5가정시
		// int[][] array = new int[5][5];
		// cnt 입력 순서 -->[0][0] -->[1][0]-->[2][0] -->[3][0]-->[4][0]
		int[][] array = new int[num][num];
// ---------------------------------------------배열에 값 넣어주기---------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = cnt;
				cnt++;
			}
		}
// -----------------------------------------------배열 출력-----------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
