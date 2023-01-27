package 일차원배열;

import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수박게임
		// 숫자를 입력받아 숫자 만큼 수박수박이 나오는 게임을 만드시오

		char[] text = { '수', '박' };
//		text[0] = 수
//		text[1] = 박
		
		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 수박게임 스타트 출력
		System.out.println("==== 수박 게임 Start! ===="); // 게임 시작 문구 출력
		System.out.print("숫자를 입력해주세요 >> "); // 숫자 입력 문구 출력

		int num = sc.nextInt(); // int형 변수 num에 입력받은 숫자 출력

		for (int i = 0; i < num; i++) { // 0부터 num변수까지 조건문 실행
			System.out.print(text[i % 2]); //
		}
		
		sc.close();
		
	}

}
