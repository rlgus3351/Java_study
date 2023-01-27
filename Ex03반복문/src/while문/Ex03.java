package while문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {		
		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받는 값, 합계 변수 선언
		int num = 0;
		int sum = 0;
		// 3. -1을 입력한 경우 종료되는 조건, 누적결과로 덧셈하는 줄 생성
//		while(num != -1) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//			sum += num;
//			System.out.print("누적 결과 : " + sum);
//		}
//		//4. -1입력시 while문을 빠져나와 종료문 출력.
//		System.out.println("종료되었습니다.");
//		sc.close();	
///////////////////////////////////////////////////////////////////////////////////
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum +=num;
			System.out.println("누적 결과 : " + sum);
			if(num==-1) {
				break;
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}

}
