package ex01변수;

public class Ex02기본변수 {

	public static void main(String[] args) {
		//Java 자료형
		// 1. 기본타입 (Primitive, Basic)
		
		// 정수타입 (byte, short, int, long)
		
		// byte - 1byte or 8bit -128 ~ 127
		byte num1 = 127;
		
		// short - 2byte or 16bits
		short num2 = 11111;
		
		//int - 4byte or 32bit
		int num3 = 12345678;
		
		//long - 8byte or 64bit
		long num4 = 3000000000L;
		
		// 실수타입 (float, double)
		
		//float - 4byte or 32bit
		float num5 = (float)3.14;
		float num6 = 3.14f;
		
		
		//double - 8byte or 64bit
		double num7 = 1.141592;
	
		//논리형 (boolean)
		// boolean -1byte or 8bit
		boolean isCheck1 = true;
		boolean isCheck2 = false;
		
		// 문자형(숫자형) -char
		// char - 2byte or 16bit
		// 문자 : 한 글자만 해당, '' 로 표현
		// 문자열 : 한 글자 포함 두 글자 이상의 글자, ""로 표현

		char text = '가';
		System.out.println(text);
		
		//기본 자료형은 아니지만 문자열을 담을 수 있는 변수
		String name = "권기현";
		System.out.println(name);

		// 2. 참조타입 (Reference) - 추후
		
	}
}
