package arrayStudy;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 크기가 5인 정수형 배열을 생성한다.
		// 정수형 배열에 5개의 점수를 입력하여 저장한다.
		// 입력된 점수를 모두 출력한다.
		
		//1.키보드로 입력받기 --> 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		
		//2. 크기가 5인 정수형 배열 생성하기
		int[] array = new int[5];
		
		//3-1. 5개의 점수를 입력하여 저장하기
		//3-2. n번째 입력 출력해주기
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1)+ "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		//4. 입력된 점수를 출력하기
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
