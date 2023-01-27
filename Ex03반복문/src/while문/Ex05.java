package while문;

public class Ex05 {

	public static void main(String[] args) {

		// 반복문
		// 특정 코드(문장) 반복해서 실행하기 위해서

		// 반복문 종류
		// while, do-while, for

		// while
		// 특정 조건에 만족 했을 때(결과값이 true) 반복을 실행

		// 사용방법
		// while (조건식) {
		// 조건식의 결과가 true일때 반복하고 싶은 코드를 작성
		// }

		// 문제
		// 1부터 10까지 콘솔에 출력 -> 1부터 10까지 수 중 홀수만 출력
		// 1. 정수형 변수 num을 만들어서 초기값 1설정
		// 2. while 조건식은 변수 num이 10보다 작거나 같은지 확인
		// 3. true일 시 num을 출력하고 num 1증가
		// 3_1. 홀수 일때만 num을 출력, 무조건 num을 1증가.

		int num = 1; // 정수형 변수를 만들어 초기값 1로 설정
		while (num <= 10) { // 10까지 출력해야하므로 num이 10보다 작아야 된다.
			// while문 시작
			if (num % 2 == 1) { // 홀수만 출력
				System.out.println(num); // num을 출력한다.
			}
			num++; // num을 1씩 증가시켜준다.
		} // while문 종료

	}

}
