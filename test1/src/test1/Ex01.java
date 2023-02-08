package test1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		int cnt = 0;
		int minus = 0;
		while (true) {
			cnt++;
			System.out.print(cnt + "주차 감량 몸무게 : ");
			minus = sc.nextInt();
			weight -= minus;
			if (weight <= goalWeight) {
				System.out.printf("%dkg 달성!! 축하합니다.!", weight);
				break;
			}

		}

	}

}
