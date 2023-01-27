package 이차원배열;

public class Ex021부터25까지넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 1부터 25까지 초기화

		int[][] array = new int[5][5];
		int num = 1;
//		---------------------------------배열 입력---------------------------------//
		// 배열 입력 순서 : [0][0] -> [0][1] -> [0][2] -> [0][2] -> [0][4]
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
//		---------------------------------배열 출력---------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
