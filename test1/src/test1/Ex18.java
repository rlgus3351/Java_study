package test1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int text = sc.nextInt();

		int[] num = new int[8];
		int[] count = new int[8];
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				num[num.length - 1] = 1;
			} else {
				num[num.length - 1 - i] = powerN(10, i);
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (text / num[i] >= 0) {
				count[i] = text / num[i];
				text %= num[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
		}
		System.out.printf("합은 %d입니다.", sum);


	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}

}
