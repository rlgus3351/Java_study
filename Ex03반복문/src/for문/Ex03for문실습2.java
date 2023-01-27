package for문;

public class Ex03for문실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~100까지 중 3의 배수를 출력하세요.
		
		for (int i = 1; i <= 100; i++) { // for문 변수 초기화/조건식 100까지/i는 1씩증가
			if (i % 3 == 0) {// 3의 배수 구하기
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 2. 1~100까지 중 3의 배수이면서 5의 배수를 출력하세요.
		
		for (int i = 1; i <= 100; i++) { // for문 변수 초기화/조건식 100까지/i는 1씩증가
			if (i % 3 == 0 && i % 5 == 0) { // 3의 배수 이면서 5의배수를 출력 &&로 조건 적어준다.
				System.out.print(i + " ");
			}
		}
	}

}
