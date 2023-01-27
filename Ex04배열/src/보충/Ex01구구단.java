package 보충;

public class Ex01구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 구구단 출력
		// 예시 2 * 1= 2 3*1 = 3 4*1 = 4 ... 9*1 = 9

		// . . . . . . . . . . . .

		// 예시 2 * 9= 18 3*9 = 27 4*9 = 36 ... 9* 9= 81
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);
			}
			System.out.println();
		}
	}

}
