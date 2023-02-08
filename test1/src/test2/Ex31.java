package test2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력>>");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int num2 = sc.nextInt();

		int[] array = { 100, 10, 1 };
		int[] cnt = new int[3];

		for (int i = 0; i < array.length; i++) {
			if (num2 / array[i] >= 0) {
				cnt[i] = num2 / array[i];
				num2 %= array[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[2-i] * num1);
			sum += cnt[i] * num1 * array[i];
		}
		System.out.println(sum);

	}

}
