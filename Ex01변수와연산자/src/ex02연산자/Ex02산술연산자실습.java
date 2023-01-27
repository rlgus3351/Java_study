package ex02연산자;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 
		// 결과확인 : 400
		// 1. num = 400;
		// 2. 출력문에 400을 쓰는 경우
		int num = 456;
		///////////////////////////////////////////////
		//1. 현재 변수에서 십의자리만 가져와서 본 숫자에서 제거하는경우
		//num = num-num % 100;
		
		//2. 100으로 나눈 몫 * 100
		//num = num / 100 * 100;
		
		//3. 100으로 나눈 몫 + "00"
        //System.out.println("결과확인 : " + num / 100 +"00");
		///////////////////////////////////////////////		
		System.out.println("결과확인 : " + num);
		
		
	}
}


