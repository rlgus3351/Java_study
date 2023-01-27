package 일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06배열실습 {
	public static void main(String[] args) {
		// 문제.
		// 1. 키보드로 부터 입력하기 위한 Scanner 변수 만들기
		Scanner sc = new Scanner(System.in);
		// 2. 길이가 5인 정수형 배열 array 만들기
		int[] array = new int[5];
		// 3. 각 인덱스 안에 키보드로부터 입력받은 값을 넣기
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 입력 : ", i + 1);
			array[i] = sc.nextInt();
		}
		// 4. 각 인덱스 안의 값 출력
//		System.out.print("입력된 점수 : ");
//		for(int i = 0; i<array.length; i++) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();
		System.out.println("입력된 점수 : " + Arrays.toString(array));

		// 5. 최고 점수 구해서 출력(변수 max 만들어 활용)
		// 6. 최저 점수 구해서 출력(변수 min 만들어 활용)
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);

		// 7. 총합 변수 만들어서 각 인덱스의 값 누적해서 출력
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("총합 : " + sum);

		// 8. 총합 변수를 배열의 길이로 나눠서 출력(평균)
		double avg = (double) sum / array.length;
		System.out.println("평균 : " + avg);

		sc.close();

	}
}
