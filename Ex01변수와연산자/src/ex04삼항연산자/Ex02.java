package ex04삼항연산자;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//1. 입력도구 꺼내오기
		//2. 출력문
		//3. 입력 받기
		//4. 출력문
		//5. 입력 받기
		//6. 더 큰 수 판별 결과값 도출하기
		//7. 결과값 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 > num2 ? num1-num2 : num2-num1;
		System.out.println("두 수의 차 : " + result);
		
		
		sc.close();
	}

}
