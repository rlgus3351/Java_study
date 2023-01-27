package for문;

public class Ex07약수 {

	public static void main(String[] args) {

		// 2의 배수 
		// 2 4 6 8 10 ...
		
		// 약수
		// 위의 모든 2의 배수는 2의 약수이다.
		
		// 3의 배수 
		// 3 6 9 12 15 ...
		
		// 24의 약수 구하기
		// 24 % 1 = 0
		// 24 % 2 = 0
		// 24 % 3 = 0
		
		
//		if(24 % 1 == 0) {
//			System.out.println(i);
//		}
//		if(24 % 2 == 0) {
//			System.out.println(i);
//		}
		int num =2000000000;
		System.out.printf("%d의 약수는  : ", num);
		for (int i = 1; i<=num/2; i++) { // 연산 속도 증가 -- 
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(num);
	}

}
