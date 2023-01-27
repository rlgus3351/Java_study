package javaproject;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 1;
		int[][] array = new int[5][5];
		// 입력 순서 [4][0] -> [3][0] -> [2][0] -> [1][0] -> [0][0]

// -------------------------------------------배열 입력--------------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[array[i].length - 1 - j][i] = cnt; // array[array[0] 길이(5)-1][i] 값에 넣어주기
				cnt++;
			}
		}
//--------------------------------------------배열 출력--------------------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
