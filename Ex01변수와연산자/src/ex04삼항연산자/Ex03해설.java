package ex04삼항연산자;

import java.util.Scanner;

public class Ex03해설 {
	public static void main(String [] args) {
		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 출력문
		System.out.print("농구공의 개수는 : ");
		// 3. 입력 받기
		int ball = sc.nextInt();
		// 4. 농구공 개수에 따른 상자 개수 연산
		int box = ball % 5 ==0 ? ball / 5 : ball / 5 + 1;
		System.out.println( "필요한 상자의 수 : "+ box + "개");
		sc.close();
	}

}
