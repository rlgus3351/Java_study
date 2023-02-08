package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int[] array = new int[10];
		int[] result = new int[10];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[array.length - 1] = 1;
			} else {
				array[array.length - 1 - i] = powerN(2, i);
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (num / array[i] >= 0) {
				result[i] = num / array[i];
				num %= array[i];
			}
		}

//		System.out.print(Arrays.toString(result));

		int index = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 1) {
				index = i;
				break;
			}
		}
//		System.out.println(index);
		for (int i = index; i < result.length; i++) {
			System.out.print(result[i] + " ");
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
