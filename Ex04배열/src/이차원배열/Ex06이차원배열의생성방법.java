package 이차원배열;

public class Ex06이차원배열의생성방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이차원 배열을 만드는 방법
		// 2 x 2 크기의 정수형 배열 만들기 값은 1,2,3,4가 들어간다.

//		--------------------------길이를 먼저 정하고 값을 넣는 방법----------------------
		int[][] array1 = new int[2][2];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1][0] = 3;
		array1[1][1] = 4;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

//		--------------------------값을 넣음과 동시에 길이를 정하는 방법----------------------

		int[][] array = { { 1, 2 }, { 3, 4 } };

//		int[][] array = {
//							{ 1, 2 }, 
//							{ 3, 4 } 
//						};

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
