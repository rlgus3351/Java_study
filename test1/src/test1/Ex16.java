package test1;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int cnt = 1;
		int[][] array = new int[num][num];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i % 2 == 1) {
					array[i][array.length - 1 - j] = cnt;
					cnt++;
				} else {
					array[i][j] = cnt;
					cnt++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
