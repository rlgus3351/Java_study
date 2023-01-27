package javaproject;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1-2+3-4+....+99-100를 계산하여 답을 출력하시오.

		// 1. 1-2+3-4+....+99-100출력
		int result = 0; // 결과값을 저장하기 위한 사전에 초기화 작업.
		for (int i = 1; i <= 100; i++) {// for_Start
			// i가 1부터 100까지 반복하는데 1씩 더하면서
			if (i % 2 == 0) {
				// i의 값이 짝수일 때
				System.out.print((-i + " ")); // i의 값에 -를 붙혀준다.
				result -= i; // 계산 결과는 짝수일 때 -부호가 붙으니 결과값에 -i만큼 뺀 값을 저장한다.
			} else {
				// i의 값이 홀수일 때
				System.out.print(i + " "); // 홀수는 부호가 + 이므로 i의 값으로 출력
				result += i; // 계산 결과는 홀수일 때 +부호가 붙으니 결과값에 +i만큼 더한 값을 저장한다.
			}

		} // for_End
			// 결과 창 출력
		System.out.println();
		System.out.print("결과 : " + result);// 결과값 출력.
	}

}
