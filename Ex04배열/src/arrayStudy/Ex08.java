package arrayStudy;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 배열의 값 중 가장 작은 값을 찾아 출력하는 프로그램을 작성하세요.
		
		//1.랜덤가져오기
		Random r = new Random();
		
		//2.int형 길이 10인 array 배열 생성, 최소 값을 넣어줄 변수 0으로 초기화
		int[] array = new int[10];
		//3.for문을 이용하여 배열에 랜덤 난수 넣기
		for(int i=0; i<10; i++) {
			array[i] = r.nextInt(100)+1;
		}
		//4. 가장 작은 값 판별하여 출력하기
		int min = array[0];
		for(int i=0; i<10; i++) {
			if(min>array[i]) {
				min =array[i];
			}
		}
		System.out.println("입력된 배열은 : " + Arrays.toString(array));
		System.out.printf("가장 작은 값은 %d입니다.", min);
		
	}

}
