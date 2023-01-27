package ex02연산자;

import java.util.Scanner;

public class Ex03산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제, 초를 입력받아 , 시, 분, 초 형태로 출력
		// 예시 ) 
		// 초 입력 : 3723
		// 1시 2분 3초
		// 키보드로부터 데이터를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : " );
		int totalSecond = sc.nextInt();
		
		///////////////////////////////////////////////
		// 입력받은 totalSecond를 가지고 시, 분, 초를 구해 출력하시오
		
		//1시간 = 3600초 
		int hour = totalSecond / 3600;
        //1분 = 60초 (초에서 시간을 빼고 나머지에 분으로 추출)
		int min = totalSecond / 60 % 60; 
        //int min = totalSecond % 3600 / 60; (시간에서 나눈 나머지로 분 추출)
		int second = totalSecond % 60;
		
		///////////////////////////////////////////////
		System.out.println(hour + "시" + min + "분" + second + "초");
		System.out.println("입력한 초 : " + totalSecond);
		sc.close();

	}

}
