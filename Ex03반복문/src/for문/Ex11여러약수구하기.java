package for문;

public class Ex11여러약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 13의 약수
		for (int j = 1; j <= 30; j++) {
			System.out.printf("%d의 약수 : ", j);
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					System.out.print(i + " ");	
				}
			}
			System.out.println();

		}
	}
}
