package festival;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		int week = 1;
		int minus = 0;

		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			minus = sc.nextInt();
			week++;

			weight -= minus;
			if (weight <= goalWeight) {
				System.out.print(weight + "kg 달성!! 축하합니다!");
				break;
			}
		}
	}

}
