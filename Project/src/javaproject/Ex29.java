package javaproject;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner sc = new Scanner(System.in);
		// N 입력
		System.out.print("N 입력 >>");
		int n = sc.nextInt(); // n값은 변수 n에 저장

		System.out.print("X 입력 >>");
		int x = sc.nextInt();// x값은 변수 x에 저장

		int[] array = new int[n]; // n개의 정수를 입력받아야하므로 array 배열에 길이 n만큼 배열 생성
//--------------------------------------------------------------------배열 입력-------------------------------------------------------------//
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >>");
			array[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
//--------------------------------------------------------------------배열 출력-------------------------------------------------------------//
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) { // array[i]의 값이 x보다 작은 값만 출력되게 한다.
				System.out.print(array[i] + " ");
			}
		}

	}

}
