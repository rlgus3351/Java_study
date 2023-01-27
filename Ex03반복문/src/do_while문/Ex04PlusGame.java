package do_while문;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {

		// 난수 (랜덤숫자)를 생성하는 변수 만들기
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 난수 생성
//		int testNum = r.nextInt(10) + 1; 
		// r.nextInt(10) = 0부터 9까지 10개 숫자 출력
//		System.out.println(testNum);
		System.out.println("=====Plus Game을 시작합니다.=====");

		int num1 = 0; // 랜덤으로 출제될 첫번째 수 변수 초기화
		int num2 = 0; // 랜덤으로 출제될 두번째 수 변수 초기화
		int result = 0; // 랜덤의 두 수의 합을 저장할 변수 초기화
		String playType = ""; // 플레이 유무 파악을 위한 변수 지정

		do {
			num1 = r.nextInt(10) + 1; // 랜덤으로 출제될 첫번째 수
			num2 = r.nextInt(10) + 1; // 랜덤으로 출제될 두번째 수

			result = num1 + num2; 									// 랜덤 숫자 결과 저장
			System.out.print(num1 + "+" + num2 + "="); 				// 문제 보여주기
			int answer = sc.nextInt(); 								// 사용자 답 입력 받기
			if (answer == result) { 								// 문제와 사용자의 답이 맞으면 맞춘 답을 출력
				System.out.println("Success");
			} else { 												// 문제와 사용자의 답이 틀리면 실패와 계속하시겠습니까? 문구 출력
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >>"); 				// 계속하시겠습니까 유무 입력어로 받기
				playType = sc.next(); 								// 플레이 유무 파악을 변수로 받기
				if (playType.equals("N") || playType.equals("n")){
					System.out.println("종료합니다.");
					break;
				}else if(playType.equals("Y") || playType.equals("y")){
					
				}else {
					break;
				}
			}

		} while (true);

		System.out.println("=====Plus Game을 종료합니다.=====");
		sc.close();
	}

}
