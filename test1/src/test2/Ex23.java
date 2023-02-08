package test2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 : ");
		int col = sc.nextInt();
		System.out.println("어느수 까지 출력 : ");
		int row = sc.nextInt();

		System.out.println(col + "단");
		for (int i = 1; i <= row; i++) {
			System.out.printf("%d*%d=%d\n", col, i, col * i);
		}

	}

}
