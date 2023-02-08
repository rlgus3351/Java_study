package festival;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기====");
		System.out.println("입력 >> ");
		String text = sc.nextLine();
		String[] array = text.split("");
		int[] count = new int[26];
		String ab = "abcdefghijklmnopqrstuvwxyz";
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (ab.substring(j, j + 1).equals(array[i]) || AB.substring(j, j + 1).equals(array[i])) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println((char) ('a' + i) + " :" + count[i]);
		}
	}

}
