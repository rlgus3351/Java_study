package javaproject;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 정수 n을 입력받아 n*n배열에 다음과 같이 숫자를 저장하고 출력하시오.
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int cnt = 1;
		// num = 5가정시
		// int[][] array = new int[5][5];
		// cnt 입력 순서 -->행 인덱스가 홀수 일때 : [0][0] -->[0][1]-->[0][2] -->[0][3]-->[0][4]
		// cnt 입력 순서 -->행 인덱스가 짝수 일때 : [1][4] -->[1][3]-->[1][2] -->[1][1]-->[1][0]
		int[][] array = new int[num][num];
		// -----------------------------------------------배열 입력-----------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i % 2 == 1) {
					array[i][array[i].length - 1 - j] = cnt;
					cnt++;
				} else {
					array[i][j] = cnt;
					cnt++;
				}
			}
		}
		//-----------------------------------------------배열 출력-----------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
