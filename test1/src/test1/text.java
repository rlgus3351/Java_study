package test1;

import java.util.Arrays;
import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		int[] array = new int[10];
		int[] count = new int[10];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[array.length - 1] = 1;
			} else {
				array[array.length - 1 - i] = powerN(2, i);
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (num / array[i] >= 0) {
				count[i] = num / array[i];
				num %= array[i];
			}
		}

		int index = 0;
		int cnt = 0;
		while (true) {
			if (count[cnt] == 1) {
				index = cnt;
				break;
			}
			cnt++;
		}

		for (int i = index; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}

	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}
}
