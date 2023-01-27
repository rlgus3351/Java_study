package 일차원배열;

import java.util.Scanner;

public class Ex11해설 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 5개의 문제에 대한 답을 입력받고 입력 받은 값을 출력해 보세요.

		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 입력된 값을 저장할 배열 선언
		int[] input = new int[5];

		// 실제 정답을 저장하고 있는 배열
		int[] answer = { 1, 4, 3, 2, 1 };
		int score = 0;

		// 답 입력칸 출력해주기
		System.out.println("=====채점프로그램=====");
		System.out.println("답을 입력하세요.");

		// for문을 이용하여 i+1번째 답을 입력하게 만든다.
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번 답 >> ");
			input[i] = sc.nextInt();
		}
		System.out.print("입력한 답은 : ");

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		System.out.println("정답 확인 ");

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 : " + score);
	}

}
