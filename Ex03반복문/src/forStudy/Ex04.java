package forStudy;

public class Ex04 {

	public static void main(String[] args) {
		// 4. 1~100까지 중 3의 배수를 출력하세요.
		for (int i = 1; i <= 100; i++) {// 1부터 100까지의 조건이 붙었으니 초기값 1부터 100까지 조건을 만족시켜주고
			if (i % 3 == 0) { // 3의 배수는 3으로 나누어떨어지는 수이므로 나머지 연산을 통해 i값을 판별해준다.
				System.out.println(i);
			}
		}

	}

}
