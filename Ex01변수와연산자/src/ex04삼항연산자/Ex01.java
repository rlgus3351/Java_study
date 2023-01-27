package ex04삼항연산자;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항 연산자 구조
		// 조건식 ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장;
		// 1. 정수형 num 숫자 2데이터 넣기
		int num = 2;
		
		// 2. num 숫자가 짝수인지 홀수인지 판별
		String result = num%2==0 ? "짝수입니다." : "홀수입니다.";
		//int a = num % 2 == 0 ? 0 : 1;
		System.out.println(result);
		
	}

}
