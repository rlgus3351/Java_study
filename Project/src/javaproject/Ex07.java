package javaproject;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오.
		// 행 개수 : 7
		System.out.println("********");
		System.out.println("*******");
		System.out.println("******");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");

		// 0. 키보드 입력을 위한 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 :");

		// 1. 입력받은 행 개수 변수 num에 저장
		int num = sc.nextInt();

		// 0부터 7까지 1씩더하여 반복하는 반복문
		for (int i = 0; i < num; i++) {// for_i_Start
			for (int j = num; j > i; j--) {// for_j_Start
				// 별의 개수는 7->6->5->4->3->2->1 감소하여 출력되므로 초기값은 입력받은 변수부터 j>i인 값까지 감소하여 진행된다.
				System.out.print("*");
			} // for_j_End
				// 행의 진행 사항이 완료되었을시 줄바꿈을 해준다.
			System.out.println();
		} // for_i_End
	}

}
