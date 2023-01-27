package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 10진수 정수를 입력받아 2진수로 변화해서 출력하시오.
		// 예시. 10 --> 1010
		
	
		// 입력받아야 하므로 스캐너를 가져오고 변수를 저장
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 정수형 변수 num을 2진수로 변환하는 함수사용.
		String num2str = Integer.toString(num, 2);
		System.out.println(num2str);
		
		
		
		

//		int[] array ={8,4,2,1};
//		int[] result = new int[4];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 >>");
//		int num = sc.nextInt();
//		
//		for(int i=0; i<array.length; i++) {
//			if(num/array[i]>0) {
//				result[i] = num / array[i];
//				num %= array[i];
//
//			}
//		}
//		for(int i=0; i<result.length; i++) {
//			System.out.print(result[i]+" ");
//		}



	}

}
