package javaproject;

public class Ex33 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(3, 3);
		System.out.println("결과 확인 : " + result);

	}
//-------------------------------------------------------------------제곱 메소드---------------------------------------------------//
	public static int powerN(int base, int n) {
		int result = base;	//베이스 값에 계속 값으르 곱해준다 ex) 2의 3승은 2*2*2 이므로 result에 2를 설정함으로 반복횟수는 n-1까지
		for (int i = 1; i < n; i++) {
			result *= base;	//곱한 값을 result에 저장해준다.
		}
		return result;
	}

}
