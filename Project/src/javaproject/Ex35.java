package javaproject;

import java.util.Random;
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// 스캐너, 랜덤 가져오기
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 게임 기회를 담을 변수 cnt 선언
		int cnt = 0;
		// boolean 타입으로 게임을 실행,종료할수 있게 선언
		boolean isOver = true;

		while (isOver) {
			int num1 = r.nextInt(10) + 1; // num1, num2를 랜덤으로 입력 정수의 범위 : 1~10까지 예시
			int num2 = r.nextInt(10) + 1;
			System.out.printf("%d + %d = ", num1, num2);
			int answer = sc.nextInt(); // 사용자로부터 답을 입력받아 answer에 저장
			if (num1 + num2 == answer) {
				System.out.println("SUCCEESS!");
			} else {
				System.out.println("Fail...");
				cnt++; // 실패시 cnt에 증감연산자를 사용하여 5번까지의 기회를 준다.
			}
			if (cnt >= 5) {
				isOver = false; // 기회는 5번이므로 isOver에 false값을 줘 반복문을 빠져나온다.
				System.out.print("GAME OVER!");
			}
		}
	}
}
