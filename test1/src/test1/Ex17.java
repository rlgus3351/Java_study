package test1;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 :");
		int num = sc.nextInt();
		int cnt = 1;
		for(int i=0; i<num; i++) {
			cnt+=i;
			System.out.print(cnt+" ");
		}
	}

}
