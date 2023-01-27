package 다중if문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 점수 입력, int 타입의 totalScore 변수 선언
		System.out.print("점수를 입력하세요 : ");
		int totalScore = sc.nextInt();
		
		// 3. 입력 받은 점수별로 조건에 맞는 학점 출력
		if(totalScore>=90) {
			System.out.println("A학점입니다!");
		}else if(totalScore>=80) {
			System.out.println("B학점입니다!");
		}else if(totalScore>=70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		sc.close();

	}

}
