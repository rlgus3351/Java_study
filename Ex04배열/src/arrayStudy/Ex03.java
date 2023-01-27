package arrayStudy;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 각각의 인덱스에 들어있는 데이터를 모두 더하여 결과 값을 출력하세요.
		
		//랜덤 가져오기
		Random r = new Random();
		
		//int형 길이 10인 배열 array 생성
		int[] array = new int[10];
		
		//총합을 구해줄 변수도 생성.
		int sum = 0;
		
		//for문을 이용하여 랜덤수 할당하기,
		for(int i=0; i<array.length; i++) { //for문 시작
			array[i] = r.nextInt(100)+1;
			sum += array[i];
		}//for문 끝
		//랜덤 난수 입력된 배열과 각각의 인덱스 값을 더한 총합을 출력
		System.out.println("입력된 배열 : " +Arrays.toString(array));
		System.out.print("각각의 인덱스의 총합 : " + sum);
		
	}

}
