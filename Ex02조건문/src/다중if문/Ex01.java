package 다중if문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//1. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		//2. "정수를 입력하세요." 출력하기
		System.out.print("정수를 입력하세요 : ");
		
		//3. 입력받은 정수 가져오기
		int num = sc.nextInt(); 

		//4. 짝수인지, 홀수인지, 0인지 판별하는 조건식
		if(num ==0){
			// 4-1. 0일시 "숫자 0입니다." 출력
			System.out.println("입력하신 숫자는 0입니다.");
		}else if(num % 2 ==1) {
			//4-2. 홀수일 시 "홀수입니다." 출력 
			System.out.println("입력하신 숫자 " + num +"는 홀수입니다.");
		}else
		{
			//4-3. 0도아니고 홀수도 아니면 짝수이므로 "짝수입니다." 출력
			System.out.println("입력하신 숫자 " + num +"는 짝수입니다.");
		}
		sc.close();
	}

}
