package forStudy;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//문제8. 입력 받은 정수의 약수를 구하세요.
		//0. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		//1. 정수입력문 출력하기
		System.out.print("정수 입력 : ");
		//2. 입력 받은 정수 변수에 저장하기
		int num = sc.nextInt();
		System.out.print("32의 약수 : ");
		//3. 정수에 관한 조건문 만들기
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	

	}

}
