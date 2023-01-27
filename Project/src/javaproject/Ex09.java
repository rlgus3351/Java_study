package javaproject;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오.
		
		//예시 ) 숫자 입력 : 123 |  숫자입력 : 128
		//      반올림 수 : 120 | 반올림 수 : 130
		
		//0. 키보드 입력을 위한 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		//1. 숫자 입력하시오 출력 및 입력받은 값 변수 num에 저장하기
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		//입력받은 수에서 1의자리를 구하려면 10으로 나누어 떨어지는 값이 1의자리 숫자이므로 round변수에 num을 10으로 나눈 나머지 값을 넣어준다.
		int round = num % 10 ;
		//반올림 : 1의자리가 4보다 크면 올림:
		//		 1의자리가 5보다 작으면 내림: 
		if(round<5) {
			round = num / 10 * 10; //입력받은 수에 10으로 나누면 해당 몫이 나오고 그걸 다시 10으로 곱한 값은 버림 작업이 된다.
		}else {
			round = num / 10 * 10 + 10; //입력 받은 수에 10으로 나누면 해당 몫이 나오고 다시 10으로 곱한 값에 10만 더하면 1의자리 올림이 된다.
		}
		//반올림 작업이 끝난 수를 round에 저장하였고 해당 값 출력.
		System.out.println("반올림 수 : "+ round);
		
	}

}
