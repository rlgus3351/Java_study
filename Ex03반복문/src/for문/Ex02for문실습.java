package for문;

public class Ex02for문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. for문 사용 21~57까지 가로로 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. for문 사용 96 ~ 53까지 가로로 출력
		for(int i = 53; i<=96 ; i++) {
			System.out.print(149-i + " ");//공통적인 부분은 53과 96의 합은 149이므로 거기서 빼준다.
		}
		
		System.out.println();
		// 3. for문 사용 21~57까지 홀수만 가로로 출력

		for(int i = 21; i<=57; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
	}

}
