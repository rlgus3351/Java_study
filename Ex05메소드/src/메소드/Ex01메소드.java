package 메소드;

import java.util.Scanner;

public class Ex01메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드
		// - 객체의 행위를 표현하기 위한 것
		// - Java에서 특정 코드를 기능으로 묶고 호출해서 사용하는 기법
		// - 메소드는 메소드 안에서 만들 수 없다.
		// - 클래스 안에서 만들면 상관없다.
		// 실습
		// 두개의 숫자를 입력받아 두수의 차를 알려주는 메소드 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();

		int result1 = difInNum(num1, num2);

		System.out.println("결과 : " + result1);

	}

	// 두 개의 숫자를 입력받아 두수의 차를 알려주는 메소드
	public static int difInNum(int a, int b) {
		int result = a > b ? a - b : b - a;
		return result;
	}
}
