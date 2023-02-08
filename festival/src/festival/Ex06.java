package festival;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력해주세요.");
		int work = sc.nextInt();
		int max = 8;

		int result = (work > max) ? max * 5000 + (int) (5000 * 1.5) * (work - max) : work * 5000;
		System.out.printf("총 임금은 %d원입니다.", result);
	}
}
