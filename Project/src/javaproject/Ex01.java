package javaproject;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 현재 몸무게와 목표 몸무게를 각각 입력 받고 주차 별 감량 몸무게를 입력 받아 목표 달성시
		// 축하 메세지를 띄우는 프로그램을 구현하시오.

		// 0. 키보드 입력을 받기 위한 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 1. 현재 몸무게와 목표몸무게 입력 받고, 변수에 저장하기.
		System.out.println("===다이어트 프로그램===");

		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();

		System.out.print("현재 몸무게 : ");
		int goalWeight = sc.nextInt();

		// 2. 주차별 감량 몸무게 입력받고 출력하기
		int week = 1; // 주차별로 담을 변수
		int minusWeight = 0; // 주차별 감량 몸무게
		while (true) {//무한 반복문 실행.
			// 2_1. 주차별 감량 몸무게 변수로 저장하기
			System.out.print(week + "주차 감량 몸무게 : ");
			minusWeight = sc.nextInt();
			weight -= minusWeight;
			week++; // 주차별 감량 몸무게 출력문에 변수로 한번 입력받은 후에 1을 더해서 week에 넣어준다.
			
			// 2_2. 목표 몸무게 달성 시 축하메세지 띄우기.
			if (weight <= goalWeight) {
				System.out.println(weight + "kg 달성 !! 축하합니다!");
				break; // 목표 몸무게보다 현재몸무게가 작거나 같을 시 break;로 반복문을 멈쳐준다. 
			}
		}
	}

}
