package arrayStudy;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 5개의 문제에 대한 답을 입력 받고 입력 받은 값을 출력해보세요.

		// 1. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 2. 정수형 길이가 5인 배열 생성
		// 2_1. 정수형 길이가 5인 정답 배열을 각각의 값으로 초기화해준다.
		int[] array = new int[5];
		int[] answer = { 1, 4, 3, 2, 1 };
		int score = 0;

		System.out.println("=====채점 하기=====");
		System.out.println("답을 입력하세요");

		// 3. for문을 이용하여 배열에 키보드 입력 값 넣어주기
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >>>");
			array[i] = sc.nextInt();
		}
		System.out.println();
		// 4. 입력된 값 출력해주기
		System.out.println("입력된 값");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// 5. 정답비교해주기
		System.out.println();
		System.out.println("정답 확인");
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == array[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.print("총점 : " + score);
	}

}
