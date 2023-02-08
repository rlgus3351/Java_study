package javaproject;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. A,B 숫자를 입력 받는다.
		// A-B를 출력한다.
		// A와 B가 모두 0을 입력받으면 프로그램은 종료된다.
		// 0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		int result = 0;// 결과값을 담기위한 변수로 사전에 초기화해준다.

		// 무한 반복문을 진행하여 A와 B에 모두 0이 입력될 시 종료하게 break;를 걸어준다/
		while (true) {
			// A입력 출력문과 입력받은 숫자 변수 a에 대입한다.
			System.out.print("A입력 >>");
			int a = sc.nextInt();

			// B입력 출력문과 입력받은 숫자 변수 b에 대입한다.
			System.out.print("B입력 >>");
			int b = sc.nextInt();

			// A와 B에 모두 0이 입력될 시 종료하게 break;를 걸어준다
			if (a == 0 && b == 0) {
				break;
			} else {// a,b가 모두 0이 아닐시 a-b를 뺀 값을 결과값result에 저장하여 출력해준다.
				result = a - b;
				System.out.println("결과 >> " + result);
			}
		}
	}
}
