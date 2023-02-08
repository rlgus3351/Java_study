package test2;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int[] count = new int[8];
		int[] result = new int[8];
		for (int i = 0; i < count.length; i++) {
			if (i == 0) {
				count[count.length - 1] = 1;
			} else {
				count[count.length - 1 - i] = powerN(10, i);
			}
		}
		for (int i = 0; i < count.length; i++) {
			if(num/count[i]>=0) {
				result[i] = num/count[i];
				num%=count[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < result.length; i++) {
			sum+=result[i];
		}
		System.out.printf("합은 %d입니다.",sum);

	}

	public static int powerN(int base, int n) {
		int result = base;
		for (int i = 1; i < n; i++) {
			result *= base;
		}
		return result;
	}

}
