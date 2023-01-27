package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
		// 0. 입력받기 위해 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		int[] temp = new int[5]; // 정수를 담을 배열 temp 선언

		for (int i = 0; i < temp.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : "); // 변수 입력
			temp[i] = sc.nextInt(); // i번째 인덱스에 저장
		}

		System.out.println("정렬 후");

		Arrays.sort(temp); // 오름 차순으로 정리
		for (int arr : temp) {
			System.out.print(arr + " "); // 출력

		}

	}

}
