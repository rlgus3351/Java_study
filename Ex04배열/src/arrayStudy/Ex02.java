package arrayStudy;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 2. 4번째 인덱스에 들어있는 값과 9번째 들어있는 값을 더하여 결과를 출력하시오.
		
		//랜덤 난수를 사용하기위해 랜덤 가져오기
		Random r = new Random();
		
		//int형이고 길이가 10인 배열 생성
		int[] array = new int[10];
		
		//for문을 이용하여 배열에 값 넣기
		for(int i=0; i<10; i++) {
		array[i] = r.nextInt(100)+1;	
		}
		//4번째,9번째 인덱스 호출 , 출력
		System.out.println("4번째 인덱스 값 : " + array[4]);
		System.out.println("9번째 인덱스 값 : " + array[9]);
		
		//더한 값을 변수로 지정하고 출력하기.
		int result = array[4] + array[9];
		System.out.println("두 인덱스의 합 : " +  result);
	}

}
