package test2;

import java.util.Random;

public class Ex25 {
	public static void main(String[] args) {
		Random r = new Random();

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int min = point[0];
		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = 1; j < point.length; j++) {
				if (point[i] > point[j]) {
					if (min > point[i] - point[j]) {
						min = point[i] - point[j];
						index1 = i;
						index2 = j;
					}
				}
				if (point[i] < point[j]) {
					if (min > point[j] - point[i]) {
						min = point[j] - point[i];
						index1 = i;
						index2 = j;
					}
				}
			}
		}
		System.out.printf("result = [%d,%d]", index1, index2);
	}

}
