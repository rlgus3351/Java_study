package test2;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("총 금액 입력:");
		int money = sc.nextInt();

		int[] array = { 10000, 5000, 1000, 500, 100 };
		System.out.printf("잔돈 : %d원\n", money);
		for (int i = 0; i < array.length; i++) {
			if (money / array[i] >= 0) {
				System.out.printf("%d원 : %d개\n", array[i], money / array[i]);
				money %= array[i];
			}
		}
	}

}
