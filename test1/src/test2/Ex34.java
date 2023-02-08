package test2;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2진수 입력");
		String str = sc.next();
//		String str = "01001101";
		int[] array = new int[str.length()];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[array.length - 1] = 1;
			} else {
				array[array.length - 1 - i] = powerN(2, i);
			}
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (str.substring(i, i + 1).equals("1")) {
				sum += array[i];
			}
		}

		System.out.printf("%s(2) = %d(10)", str, sum);

	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}

}
