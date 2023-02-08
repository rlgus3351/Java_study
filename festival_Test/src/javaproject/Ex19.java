package javaproject;

public class Ex19 {

	public static int cal(int a, int b, char c) {// int형 메소드 cal을 선언 매개변수로는 (정수형 a,b, 문자형 c)를 받음
		int result = 0; // 결과값을 저장하기 위한 변수 result를 0으로 초기화
		if (c == '+') { // c의 값이 +이면 ------> 문자형은 ==으로 비교 , 문자열은 .equals()로 비교
			// a와 b를 더하여 결과값에 저장한다.
			result = a + b;
		} else if (c == '-') {// c의 값이 -이면
			// a와 b를 빼서 결과값에 저장한다.
			if (a > b) {
				result = a - b;
			} else {
				result = b - a;
			}
		} else if (c == '*') {// c의 값이 *이면
			// a*b를 곱하여 결과값에 저장한다.
			result = a * b;
		} else {// 나머지 조건은 /이므로
			// a와 b를 나누어 결과값에 저장한다.
			result = a / b;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. num1, num2, op(+,-,*,/)를 매개변수로 받아
		// num1과 num2를 op에 맞게 연산한 결과값을 반환해주는 cal 메소드를 작성하세요.
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		System.out.println(cal(num1, num2, op));
	}

}
