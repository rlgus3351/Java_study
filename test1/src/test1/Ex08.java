package test1;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A입력 >>");
			int a = sc.nextInt();
			System.out.print("B입력 >> ");
			int b = sc.nextInt();
			System.out.printf("결과 >> %d\n", a - b);
			if (a == 0 && b == 0) {
				break;
			}
		}
	}

}
