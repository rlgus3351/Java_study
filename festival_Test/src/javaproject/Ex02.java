package javaproject;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 일한 시간을 입력받아 총 임금을 계산하는 시급 계산기 입니다.
		// 시급은 5000원 이며 8시간 보다 초과 근무한 시간에 대해 1.5배의 시급이 책정된다.
		
		//0. 일한 시간 입력을 받으려면 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		//1. 일한 시간을 입력하세요 출력문, 변수에 담기
		System.out.print("일한 시간을 입력하세요 : ");
		int workHour = sc.nextInt(); //일한 시간 입력값 넣는 변수 
		int hourlyWage = 5000; //시급
		int result = 0;	//결과 값 사전에 초기화.
		
		//2. 8시간보다 초과 근무한 시간에 1.5배의 시급을 책정해주기
		if(workHour>8) {//8시간초과시
			//9시간 시급 = 8시간 * 5000 + 1시간 * (5000 * 1.5) 
			result = (workHour/8*8)*hourlyWage + (workHour % 8) * (int)(hourlyWage * 1.5) ;
		}else {//8시간 이하 근무 했을 때
			//시간 * 5000원.
			result = hourlyWage * workHour;
		}
		System.out.println("총 임금은 " + result + "입니다.");
		
		sc.close();
	}

}
