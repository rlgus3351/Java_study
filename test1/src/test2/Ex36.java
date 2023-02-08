package test2;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 알파벳 빈도수 구하기 ======");
		System.out.print("입력 >> ");
		String text = sc.nextLine();
		String[] array = text.split("");
		String ab = "abcdefghijklmnopqrstuvwxyz";
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int[] count = new int[26];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < ab.length(); j++) {
				if (ab.substring(j, j + 1).equals(array[i]) || AB.substring(j, j + 1).equals(array[i])) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((char) ('A' + i) + " : " + count[i]);
		}

	}

}
