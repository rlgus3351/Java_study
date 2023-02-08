package test2;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();

		int[][] array = new int[n][n];

		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i % 2 == 1) {
					array[i][array.length - 1 - j] = cnt++;
				} else {
					array[i][j] = cnt++;

				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
