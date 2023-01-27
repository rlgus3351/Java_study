package for문;

public class Ex09해설 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단을 출력하는 코드
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d ", 2, i, 2 * i);
//		}
//		System.out.println();
//		//3단을 출력하는 코드 
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d ", 3, i, 3 * i);
//		}
//		System.out.println();
		
		//통합 코드.
		for(int j=2; j<=9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d ", j, i, j * i);
			}
			System.out.println();
		}

	}

}
