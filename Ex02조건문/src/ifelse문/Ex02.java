package ifelse문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. "점수를 입력하세요." 출력하기
		System.out.print("점수를 입력하세요 : ");
		
		// 3. 입력받은 점수를 저장할 int타입 grade 변수 선언
		int grade = sc.nextInt();
		
		// 4. 점수가 60점 이상이면 --> "합격입니다." 출력
		//    점수가 60점 이상이 아니면 --> "불합격입니다." 출력
		if( grade >= 60) {
			System.out.println("합격입니다. ");
		} else {
			System.out.println("불합격입니다. ");
		}
		
		sc.close();
	}

}
