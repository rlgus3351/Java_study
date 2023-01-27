package arrayStudy;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 입력한 점수중 최고 점수, 최저 점수, 점수의 총합, 평균를 출력하세요.
		
		//1. 키보드 입력을 받기 위해 스캐너를 가져온다.
		Scanner sc = new Scanner(System.in);
		
		//2. 정수형이면서 길이가 5인 배열을 생성한다.
		int[] array = new int[5];
		
		//3. for문을 이용하여 키보드 입력값을 배열에 넣어준다.
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		//4. 입력된 점수를 출력
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
			if(max<array[i]) {
				max = array[i];
			}
		}
		//5. 최고 최저 점수를 구한다.
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		
		//6. 총합과 평균 구하기
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum/array.length;
		System.out.println("평균 : " + avg);
	}

}
