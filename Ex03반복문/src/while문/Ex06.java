package while문;

public class Ex06 {

	public static void main(String[] args) {
		// 문제.
		// 3,6,9 게임
		// 1부터 50까지 숫자를 출력
		// 1부터 50까지 숫자 중 1의 자리가 3,6,9 일 경우는
		// 숫자가 아닌 박수를 출력
		int num = 1; // 변수 출력

		while (num <= 50) { 
			int temp = num % 10; //num % 10 일의자리 수만 담을 수 있게 임시저장공간 선언
			if (temp == 3 || temp == 6 || temp == 9) { //일의 자리가 3,6,9일때 짝
				System.out.println("짝");
			} else { //그외에 숫자는 출력
				System.out.println(num);
			}
			num++;
		}

	}

}
