package test1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int num = sc.nextInt();
		int max = 8;
		int result = (num > max) ? max * 5000 + (int) (1.5 * 5000) * (num - max) : num * 5000;
		System.out.printf("총 임금은 %d원 입니다.", result);

	}

}
