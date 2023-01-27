package arrayStudy;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		//문제. 배열의 값중 짝수인 값만 출력하는 프로그램을 작성하세요.
		
		//1. 랜덤 가져오기
		Random r = new Random();
		//2. int형 길이가 10인 array 배열 생성
		int[] array = new int[10];
		System.out.print("array에 들어있는 짝수는 : ");
		//3. for문을 이용하여 값을 할당해주기
		for(int i =0; i<10; i++) {
			array[i] = r.nextInt(100) + 1;
			//3-1.조건문을 이용하여 짝수 값만 출력해주기
			if(array[i]%2 ==0) {
				System.out.print(array[i] + " " );
			}
		}
		System.out.println("입니다.");
		

	}

}
