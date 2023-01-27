package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		// 문제. 문자열 형태의 2진수를 입력받아 10진수로 바꾸는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수를 입력하세요. >>> ");
		String str = sc.next();
		String[] array = str.split(""); // 입력 받은 수를 String타입 배열 array에 인덱스에 한칸씩 넣어준다.

//----------------------------------------------------------------------2진수 자리 값 계산---------------------------------------------------//
		int[] num = new int[array.length]; // array배열과 같은 크기를 갖는 정수형 num 배열 생성
		for (int i = 0; i < array.length; i++) {
			if (i == 0) { // 맨끝에 인덱스 (오른쪽)의 값은 1이므로 1로 지정해주고
				num[array.length - 1] = 1;
			} else {
				num[array.length - 1 - i] = powerN(2, i); // 나머지 인덱스의 값은 오른쪽부터 2의 i승 값을 넣어준다.
			}
		}
		System.out.print(str + "(2)" + " = "); // 2진수 출력
//----------------------------------------------------------------------10진수---------------------------------------------------//
		int sum = 0; // 합계를 담아줄 변수sum 선언
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("1")) { // array 배열에 자리수가 1이면 해당 값을 num의 자리값에 곱한 수를 sum에 저장
				sum += num[i] * 1;
			}
		}
		System.out.print(sum + "(10)"); // 10진수 출력
	}

//-------------------------------------------------------------------2의 제곱 메소드---------------------------------------------------//
	public static int powerN(int base, int n) {
		int result = 2; // 2의 1승은 2이므로 처음 값을 2로 저장
		for (int i = 1; i < n; i++) {
			result *= base; // 2에 base의 값 전까지 곲한 값을 저장해준다.
		}
		return result;
	}

}
