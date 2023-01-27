package 이차원배열;

import java.util.Arrays;

public class Ex07비정방형배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0열의 길이는 3 | 1열의 길이는 2 | 2열의 길이는 5

		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[5];

		int cnt = 1;

//-------------------------------------------------배열 입력-----------------------------------------------------------//		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}
//-------------------------------------------------배열 출력-------------------------------------------------------//		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// for문을 사용하지 않고 배열 안의 값을 확인하는 방법
		String[] team = { "왕지강", "심형선", "권기현", "이세미", "김호원" };
		String result = Arrays.toString(team);
		System.out.println(result);

	}

}
