package for문;

public class Ex09다중for문 {

	public static void main(String[] args) {
		
		//2단을 가로로 출력
		for(int i =2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d ", i, j, i*j);					
				}
			System.out.println();
			}
		}


	}

