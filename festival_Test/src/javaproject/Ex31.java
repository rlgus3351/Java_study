package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >>");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >>");
		int num2 = sc.nextInt();

		int[] array = { 100, 10, 1 }; // 3자리 수를 나누기 위한 배열에 (100,10,1)로 값을 넣어주기
		int[] count = new int[3]; // num2의 자리값을 담기 위한 배열 생성
		for (int i = 0; i < array.length; i++) {
			if (num2 % array[i] >= 0) { // num2가 array배열에 나머지연산으로 0보다 크면
				count[i] = num2 / array[i]; // count배열에 [i]번째에 값을 넣어준다.
				num2 %= array[i]; // num2의 나머지는 다른 10,1로 나누어주기위해 나머지 연산한 값을 num2에 넣어준다.
			}
		}
		int sum = 0; // 곱셈의 합을 담을 변수 선언
		for (int i = 0; i < count.length; i++) {
			System.out.println(num1 * count[count.length - 1 - i]); // 출력 : num1 * count의 끝자리서부터(길이-1-i)값은 인덱스 오른쪽 끝부분부터
			sum += array[i] * num1 * count[i]; // sum 함수에 num1*count*자리수를 곱하여 저장한다.
		}
		System.out.println(sum); // 출력 : 자리수 까지 곱한 값을 출력한다.

	}

}
