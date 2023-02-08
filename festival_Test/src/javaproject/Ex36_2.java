package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex36_2 {

	public static void main(String[] args) {

		String str = "00101000";
		String[] array = str.split("");
		int[] num = new int[array.length];
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				num[num.length - 1] = 1;
			} else {
				num[num.length - 1 - i] = powerN(2, i);
			}

		}

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (array[i].equals("1")) {
				sum += num[i] * 1;
			}
		}
		System.out.println(str + "(2)" + " " + sum + "(10)");
	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}
}
