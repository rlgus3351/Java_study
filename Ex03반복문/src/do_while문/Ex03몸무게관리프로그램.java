package do_while문;

import java.util.Scanner;

public class Ex03몸무게관리프로그램 {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);			//스캐너 가져오기
		System.out.print("현재 몸무게 : ");					//현재 몸무게 입력문 출력
		int now_Weight = sc.nextInt();					//현재 몸무게 변수에 저장
		System.out.print("목표 몸무게 : ");					//목표 몸무게 입력문 출력
		int goal_Weight = sc.nextInt();					//목표 몸무게 변수에 저장
		int week_Decrease_Weight = 0;					//주차별 몸무게 감량 값 변수에 초기값 설정

		int week_Number = 1;							//주차별 카운트 다운 변수 저장
		do {											//do-while문 시작
			System.out.print(week_Number + "주차 감량 몸무게 :");		//주차별 감량 몸무게 입력하기
			week_Decrease_Weight = sc.nextInt();					//주차별 감량 몸무게 저장
			now_Weight -= week_Decrease_Weight;			//현재 몸무게에 감량 몸무게 뺀 값 복합대입연산자로 저장.
			week_Number++;								//주차별 감량 값이 다르므로 주차별로 적을 수 있게 1을 더해준다.
			
			if (now_Weight <= goal_Weight) {				//현재 몸무게가 목표 몸무게보다 작을 시 감량 성공 
				System.out.println(now_Weight + "kg 달성 !! 축하합니다!!"); // 성공 메시지 출력													// 브레이크;
			}

		} while (now_Weight>goal_Weight); 								//while(true)로 무한반복 | do-while문 종료 시점
		
		sc.close();
	}

}
