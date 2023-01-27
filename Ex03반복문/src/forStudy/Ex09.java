package forStudy;

public class Ex09 {

	public static void main(String[] args) {
		// 9. 1부터 1000까지의 숫자 중 완전수인 숫자를 모두 출력하세요.
		// 완전수란 자신의 약수중에서 자신을 제외한 모든 약수의 합이 자신과 같은 수를 의미한다.
		for (int j = 1; j <= 1000; j++) { // 1부터 1000까지 숫자 조건 ----------------------------->>for1 start
			int sum = 0; // 약수들의 합을 구하기 위해서 변수 선언
			for (int i = 1; i < j; i++) {// 1부터 j의 값 자기 자신을 포함시키면 안되므로  for문 선언 ---------------------------->>for2 start
				if (j % i == 0) { // j의 약수를 구하기 위해 나누어 떨어지는 수를 sum에 더한다.
					sum += i;
				}
			}//-------------------------->>for2 start
			if (j == sum) {// for1에서 끝난 sum으로 j와 비교 j
				System.out.println(j);
			}

		} //----------------------------->>for1 end

	}
}
