package test2;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 자리 0을 제외한 숫자를 입력해주세요 >> ");
		String text = sc.next();
		String[] array = text.split("");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "0", "6", "9":
				sum += 6;
				break;
			case "1":
				sum += 2;
				break;
			case "2", "3", "5":
				sum += 5;
				break;
			case "4":
				sum += 4;
				break;
			case "7":
				sum += 3;
				break;
			case "8":
				sum += 7;
				break;
			}
		}

		System.out.printf("대시('-')의 총합 >> %d", sum);

	}

}
