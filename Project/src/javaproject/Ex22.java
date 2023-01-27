package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 입력받아 배열의 인덱스의 수만큼 별을 출력
		// 예시 ) 0번째 별의 수 : 9
		// 1번째 별의 수 : 4

		// 9: *********
		// 4: ****

		int[] array = new int[5]; // 사용자에게 입력받은 숫자를 담을 정수형 변수 선언
		Scanner sc = new Scanner(System.in);
//-------------------------------------배열 입력------------------------------//
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 별의 수  : ", i);
			array[i] = sc.nextInt(); //입력받은 수 i번 반복되므로 array[i] 배열에 넣기 
		}
//-------------------------------------입력된 배열 확인------------------------------//
//		System.out.println(Arrays.toString(array));

//-------------------------------------입력된 배열의 인덱스 수만큼 별 찍기-----------------------------//
		for (int i = 0; i < array.length; i++) {//for_1_start
			System.out.printf("%d : ", array[i]); //입력된 순서대로 입력 값 출력하기
			for (int j = 0; j < array[i]; j++) { //입력된 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
