package while문;

public class Ex06_369게임 {

	public static void main(String[] args) {
		// 문제.
		// 3,6,9 게임
		// 1부터 50까지 숫자를 출력
		// 1부터 50까지 숫자 중 1의 자리가 3,6,9 일 경우는
		// 숫자가 아닌 박수를 출력
		int num = 1;
		
		while(num<=100) {
			if(num %10 == 3 || num %10 == 6 || num %10 == 9 || num/10 ==3 || num /10 ==6 ||num /10 ==9)
			{
				if(num % 33 == 0){
					System.out.println("짝짝!");
				}else {
					System.out.println("짝!");
				}
			}else {
				System.out.println(num);
			}
			num++;
		}

	}

}
