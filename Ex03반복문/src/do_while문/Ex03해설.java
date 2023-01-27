package do_while문;

import java.util.Scanner;

public class Ex03해설 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int nowKg = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalKg = sc.nextInt();
		int num = 1;
		
		do {
			System.out.println(num + "주차 감량 몸무게 : ");
			int minusKg = sc.nextInt();
			nowKg -= minusKg;
			num++;
			if (nowKg <= goalKg) {
				System.out.println();
			}
		} while (nowKg>goalKg);

		System.out.println(nowKg + "kg 달성 !! 축하합니다!!");
		sc.close();
	}

}
