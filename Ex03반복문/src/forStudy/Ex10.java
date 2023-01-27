package forStudy;

public class Ex10 {

	public static void main(String[] args) {
		// 문제 10번. 구구단 2단부터 9단까지 출력하세요.
		// 반복되는 부분 2가지 찾기

		// step.1
		for (int j = 2; j <= 9; j++) { // 구구단 단을 출력 조건은 2단부터 9단까지 1씩 증가하는 FOR_1문 시작
			System.out.printf("%d단 : ", j);
			for (int i = 1; i <= 9; i++) { // 구구단 단안에 1~9까지 1씩 증가하는 FOR_2문 시작
				System.out.printf("%d * %d = %d ", j, i, j * i); // J는 단의 숫자 I는 구구단의 한줄을 의미 J=2, I=1 이면 J*I = 2가 나오게 출력.
			} // FOR_2문 끝
			System.out.println(); // 단별로 구별이 가능하게 한 단이 끝나면 줄바꿈을 해준다.
		} // FOR_1문 끝

	}

}
