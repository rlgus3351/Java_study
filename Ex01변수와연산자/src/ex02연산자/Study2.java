package ex02연산자;

import java.util.Scanner;

public class Study2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1>num2? "두 수의 차 : " + (num1-num2) :"두 수의 차 : " + (num2-num1) );
		
		sc.close();
		
	}

}
