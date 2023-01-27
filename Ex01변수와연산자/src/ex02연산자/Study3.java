package ex02연산자;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		System.out.println(ball % 5 ==0 ? "필요한 상자의 수 : " + (ball / 5) : "필요한 상자의 수 : " + (ball / 5+1));
		sc.close();
		
	}

}
