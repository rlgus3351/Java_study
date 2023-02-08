package test1;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		int[][] array = new int [num][num];
		int cnt = 1;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = cnt;
				cnt++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

	
	
}
