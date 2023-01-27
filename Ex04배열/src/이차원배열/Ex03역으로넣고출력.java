package 이차원배열;

public class Ex03역으로넣고출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언 [5][5]
		int[][] array = new int[5][5];

		// 넣을 값 변수 선언 초기값 21
		int cnt = 21;
//		---------------------------------CASE 1---------------------------------//
//		---------------------------------배열 입력---------------------------------//
		// 배열 입력 순서 : [0][4] -> [0][3] -> [0][2] -> [0][1] -> [0][0]
		for (int i = 0; i < array.length; i++) { // for_1_Start
			for (int j = 1; j <= array[i].length; j++) {// for_2_Start
				array[i][array[i].length - j] = cnt;
				cnt++;
			} // for_2_end
		} // for_1_end
//		---------------------------------CASE 2---------------------------------//
//		for(int i=0; i<array.length; i++) {
//			for(int j=array.length-1; j>=0; j--) {
//				array[i][j] = cnt;
//				cnt++;
//			}
//		}

//		---------------------------------배열 출력---------------------------------//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
