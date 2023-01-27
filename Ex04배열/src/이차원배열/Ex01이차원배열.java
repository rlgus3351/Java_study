package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일차원 배열 : int [3]	array = new int[3];
		//이차원 배열 : int[M][N] array = new int[M][N];
		// M:행, N: 열
		
		// 3행 3열 2차원 배열 만들기
		int sum = 10;
		int[][] array = new int[3][3];
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		
		array[2][0] = 70;
		array[2][1] = 80;
		array[2][2] = 90;

		System.out.print(array[0][0]+" ");
		System.out.print(array[0][1]+" ");
		System.out.print(array[0][2]+" ");
		
		System.out.println();
		
		System.out.print(array[1][0]+" ");
		System.out.print(array[1][1]+" ");
		System.out.print(array[1][2]+" ");
		
		System.out.println();
		
		System.out.print(array[2][0]+" ");
		System.out.print(array[2][1]+" ");
		System.out.print(array[2][2]+" ");
		
		//이차원 배열의 길이를 알 수 있는 방법
		//행의 길이를 알 수 있는 방법
		System.out.println();
		System.out.println("행의 길이 : " + array.length);
		
		// 0열의 길이를 알수 있는 방법
		System.out.println("0열의 길이 : " + array[0].length);
		
		// 1열의 길이를 알수 있는 방법
		System.out.println("1열의 길이 : " + array[1].length);
		
		// 2열의 길이를 알수 있는 방법
		System.out.println("2열의 길이 : " + array[2].length);

	}

}
