package arrayStudy;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 숫자를 입력받아 짝수인 경우 "수박수박", 홀수인 경우 "수박수"를 출력하는 프로그램을 작성하시오..
		
		//1. 키보드 입력을 받기 위해 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		//2. 1차원 문자형 배열을 선언하기
		char[] text = {'수', '박'};

//		text[0] = 수
//		text[1] = 박
		
		//2-1. 키보드로 숫자 입력받기
		System.out.println("=====수박 게임 Start!=====");
		System.out.print("숫자를 입력해주세요  >>>");
		int num = sc.nextInt();
		//3. 홀짝 판별하여 출력하기
		
		for (int i = 0; i < num; i++) {
			System.out.print(text[i%2]);
		}
	}

}
