package test2;

import java.util.Random;
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		while (true) {
			int num1 = r.nextInt(10) + 1;
			int num2 = r.nextInt(10) + 1;

			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt();
			if (num1 + num2 == answer) {
				System.out.println("Success!");
			} else {
				System.out.println("Fail...");
				cnt++;
			}
			if (cnt > 4) {
				System.out.println("Game Over!");
				break;
			}
		}
	}

}
