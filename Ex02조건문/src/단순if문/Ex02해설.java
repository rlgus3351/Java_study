package 단순if문;

import java.util.Scanner;

public class Ex02해설 {

	public static void main(String[] args) {
		
		// 1. 나이 입력 받기
		// 1) Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		// 2) "나이를 입력하세요 : " 출력
		System.out.print("나이를 입력하세요 : ");
		// 3) 숫자를 입력받아 변수에 담기
		int age = sc.nextInt();
		// 2. 성인인지 아닌지 구분하기
		if (age>=20) {
			System.out.println("성인입니다.");
		}
		sc.close();

	}

}
