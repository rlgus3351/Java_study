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

		// 정수형 변수 num을 2진수로 변환하는 함수사용.

		int[] array = new int[10];
		int[] result = new int[10];
		System.out.println("숫자 입력 >>");
		int num = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[9 - i] = powerN(2, i);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (num / array[i] > 0) {
				result[i] = num / array[i];
				num %= array[i];
			}
		}

		int index = 0;
		int cnt = 0;
		while (true) {
			cnt++;
			if (result[cnt] == 1) {
				index = cnt;
				break;
			}
		}

		System.out.println(index);
		for (int i = index; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static int powerN(int base, int n) {
		int result = base; // 베이스 값에 계속 값으르 곱해준다 ex) 2의 3승은 2*2*2 이므로 result에 2를 설정함으로 반복횟수는 n-1까지
		if (n == 0) {
			result = 1;
		}
		for (int i = 1; i < n; i++) {

			result *= base; // 곱한 값을 result에 저장해준다.

		}
		return result;
	}

}
