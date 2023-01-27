package ifelse문;

import java.util.Scanner;

public class Study01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1과목 점수를 입력하세요 : ");
		int score_1 = sc.nextInt();
		System.out.print("2과목 점수를 입력하세요 : ");
		int score_2 = sc.nextInt();
		
		int total = score_1 + score_2;
		
		if(total / 2 >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
}
