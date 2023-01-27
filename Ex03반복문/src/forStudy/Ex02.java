package forStudy;

public class Ex02 {

	public static void main(String[] args) {

		// 2. for문을 사용하여 96에서 53까지 출력하시요.

		// 2-1 감소연산자를 통해서 초기값 96부터 53까지 감소하는 반복문
		for (int i = 96; i >= 53; i--) {
			System.out.println(i);
		}

		// 2-2 증가연산자를 통해서 초기값 53부터 96까지 증가하는 반복문이다.
		for (int i = 53; i <= 96; i++) {
			System.out.println(149 - i); // 53과 96이 순서가 바껴야하는데 출력했을 때 숫자는 149로 합이 같다. ----> 149에서 i값을 빼면 내림차순으로 정렬된다.
		}

	}

}
