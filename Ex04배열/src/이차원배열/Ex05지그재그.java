package 이차원배열;

public class Ex05지그재그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 21;
		int[][] array = new int[5][5];
//		---------------------------------배열 입력---------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i % 2 == 1) { // 행이 1,3번째에 값을 반대로 넣어준다
					// [1][4] -> [1][3] -> [1][2] -> [1][1] -> [1][0]
					array[i][4 - j] = cnt;
					cnt++;
				} else {// 행이 0,2,4번째에 값을 반대로 넣어준다 [0][0] -> [0][1] -> [0][2] -> [0][3] -> [0][4]
					array[i][j] = cnt;
					cnt++;
				}
			}
		}
//		---------------------------------배열 출력---------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
