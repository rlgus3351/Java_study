package test2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int cnt = 1;
		int[][] array = new int[num][num];
		int s = num / 2; // 2
		int e = num / 2; // 2

		for (int i = 0; i < array.length; i++) {
			for (int j = s; j <= e; j++)
				array[j][i] = cnt++;
			if (i >= 2) {
				s++;
				e--;
			} else {
				s--;
				e++;
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
