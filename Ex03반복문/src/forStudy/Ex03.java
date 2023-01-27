package forStudy;

public class Ex03 {

	public static void main(String[] args) {

		// 3. for문을 사용하여 21에서 57까지의 수 중 홀수만 출력하시오.
		for (int i = 21; i <= 57; i++) {// 초기값 21부터 57까지하는 for문 조건을 만든다.
			if (i % 2 == 1) {// i값이 증가될수록 홀수만 출력하기위해서 i의 값을 2로 나누면 나머지 값이 1이면 홀수이므로 해당 조건문으로 i값을 출력
				System.out.println(i);
			}
		}

	}

}
