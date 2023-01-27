package while문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
//		//2. 조건문에 들어갈 변수 초기 설정 
		int num = 0;
//		//3. n이 10보다 작을 때 실행 될 조건문
//		while(num < 10) {
//			//반복될 조건문
//			System.out.print("정수 입력 : ");
//			//반복될 조건문에서 n의 값이 10보다 작아야 계속 실행할 수 있으니 입력받은 수를 n으로 대입. 
//			num = sc.nextInt();
//		}
//		//while문을 나왔을 때 "종료되었습니다." 출력
//		System.out.println("종료되었습니다.");
		
		while(true) {
			System.out.print("정수 입력 : ");
			num=sc.nextInt();
			//num이 10보다 큰지를 판단 ---> 조건문
			if(num>=10) {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
