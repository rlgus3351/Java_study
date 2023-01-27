package switch문;

import java.util.Scanner;

public class Ex02해설 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// swtich 문으로 성적 계산 프로그램 만들기!
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		switch(totalScore/10) {
		
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		default:
			System.out.println("D학점 입니다.");
			break;

		}
		
		sc.close();
	}

}
