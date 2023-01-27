package forStudy;

public class Ex05 {

	public static void main(String[] args) {
		
		
		//5. 1~100까지 중 3의 배수이면서 5의배수를 출력하세요.
		for(int i=1; i<=100; i++) {//1~100까지 1씩 증가하는 for문 선언
			if(i%3==0 && i%5==0) {//3의 배수이면서 5의 배수를 출력하는 조건 AND연산!
				System.out.println(i);
			}
			
		}

	}

}
