package test1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		int result = (num % 10 > 4) ? num / 10 * 10 + 10 : num / 10 * 10;
		System.out.printf("반올림 수 : %d", result);
	}

}
