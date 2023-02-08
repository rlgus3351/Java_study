package test2;

import java.util.Random;

public class Ex21 {
	public static void main(String[] args) {
		Random r = new Random();

		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(45) + 1;
			for (int j = 1; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 : " + array[i]);
		}
	}

}
