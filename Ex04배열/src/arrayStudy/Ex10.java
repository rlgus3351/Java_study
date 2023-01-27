package arrayStudy;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 숫자를 입력받아 3의 배수인 숫자를 출력하는 프로그램을 작성하세요.

		// 1. 키보드를 입력하기위해 스캐너를 가져온다.
		Scanner sc = new Scanner(System.in);

		// 2. 정수형이며 길이가 10인 배열을 선언한다.
		int[] array = new int[10];

		// 3. 숫자를 입력받는다.
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		// 3-1. 입력된 배열을 출력한다.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 4. 3의 배수인 숫자를 출력해준다.
		System.out.println();
		System.out.print("3의 배수는 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
