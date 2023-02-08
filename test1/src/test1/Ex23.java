package test1;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int col = sc.nextInt();

		System.out.println("어느 수 까지 출력 : ");
		int row = sc.nextInt();

		System.out.printf("%d단\n", col);
		for (int i = 1; i <= row; i++) {
			System.out.printf("%d*%d = %d\n", col, i, col * i);
		}
	}

}
