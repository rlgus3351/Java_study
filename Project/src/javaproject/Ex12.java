package javaproject;

public class Ex12 {
	public static boolean isDivide(int a, int b) {// booleand 타입에 메소드 isDivide를 선언(정수형 변수 a와 b를 매개변수로 받음)
		return a % b == 0 ? true : false;
	}

	public static void main(String[] args) {

		// 문제. 두 개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide()를 작성하세오.
		// 나누어지면 true 나누어지지 않으면 false를 반환.

		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);

		// 결과값 출력
		System.out.println("결과 확인 : " + result);

	}

}
