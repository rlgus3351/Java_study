package festival;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("원본");
		int[][] array = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("90도 회전");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][array.length - 1 - i] + "\t");
			}
			System.out.println();
		}

	}

}
