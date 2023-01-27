package 이차원배열;

public class Ex04세로로넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 array 배열 생성 [5][5] 사이즈
		int[][] array = new int[5][5];

		// 인덱스별로 넣어줄 값이 1씩 증가하므로 초기값을 21로 설정하여 증감연산자를 통해 값을 증가시켜준다.
		int cnt = 21;
//		---------------------------------배열 입력---------------------------------//
		// 배열 입력 순서 : [0][0] -> [1][0] -> [2][0] -> [3][0] -> [4][0]
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = cnt;
				cnt++;
			}
		}
//		---------------------------------배열 출력---------------------------------//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//		 --------------------------------for-each로 출력하기-----------------------//
//		array : 2차원 배열로 행이 가진 배열을 꺼내온 후 다시 배열에서 값을 꺼내야한다.
		for (int[] arr : array) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
