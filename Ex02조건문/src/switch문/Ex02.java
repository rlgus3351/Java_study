package switch문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// switch 문으로 성적 계산 프로그램 만들기!
		Scanner sc = new Scanner(System.in);
		// "점수를 입력하세요" 출력하기
		System.out.print("점수를 입력하세요: ");
		int totalScore = sc.nextInt();
		
		int grade = totalScore / 10 ;
		
		switch (grade) {
		case 10: 
			System.out.println("A학점 입니다.");
			break;
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
