package 다중if문;

import java.util.Scanner;

public class Ex02해설 {
	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 1. 점수 입력 받기
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();

		// 2. 점수를 판단!
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 70점 미만이면 D
		if (totalScore >= 90) {
			System.out.println("A학점 입니다!");
		} else if (totalScore >= 80) {
			System.out.println("B학점 입니다!");
		} else if (totalScore >= 70) {
			System.out.println("C학점 입니다!");
		} else {
			System.out.println("D학점 입니다!");
		}
		sc.close();
	}

}
