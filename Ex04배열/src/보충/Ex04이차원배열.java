package 보충;

import java.util.Scanner;

public class Ex04이차원배열 {
	public static void main(String[] args) {

		// 문제 . 3행 5열 배열 answer을 만들고

		Scanner sc = new Scanner(System.in);
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };
		int sum = 0;
		for (int i = 0; i < answer[1].length; i++) {
			System.out.print((i + 1) + "번째 답 >>");
			answer[1][i] = sc.nextInt();
		}

		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				sum += answer[2][i];
				System.out.print("O\t");
			} else {
				System.out.print("X\t");
			}
		}
		System.out.println();
		System.out.println("총점 : " + sum + "점");
		sc.close();
	}

}
