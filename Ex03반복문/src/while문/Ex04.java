package while문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) { //메인메소드
		Scanner sc = new Scanner(System.in); //스캐너 가져오기
		int num = 0; //스캐너 입력값 받을 공간 변수로 지정
		int even_num = 0; //짝수 공간
		int odd_num = 0; //홀수 공간
		
		//조건문
		while(true) {//무한반복문 --> 제어부분 정해줘야한다.
			System.out.print("숫자 입력 : "); //사용자의 키보드 입력으로 숫자 입력 반복
			num = sc.nextInt(); //입력된 값 변수로 지정
			if(num%2==0) { //짝수 조건으로 짝수 공간에 1을 더해준다.
				even_num += 1;
			}else if(num==-1){ //-1이 입력될 경우에 무한루프가 벗어날수 있게 조건을 만든다.
				break;
			}else { //-1도 아니고 짝수도 아니면 홀수로 판별하여 홀수 공간에 1을 더해준다. 
				odd_num += 1; 
			}
				
			System.out.println("짝수 개수 : " + even_num); //짝수 개수 출력
			System.out.println("홀수 개수 : " + odd_num);//홀수 개수 출력
		} //while문 종료
		System.out.println("프로그램이 종료되었습니다.");
		
		sc.close();
	
		
		
	}
	
	
}
