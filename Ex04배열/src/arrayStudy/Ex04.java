package arrayStudy;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 배열 안에 있는 수의 평균을 구하여 출력하세요.
		
		//랜덤 가져오기
		Random r = new Random();
		
		//int형이고 길이가 10인 array 배열 생성
		int[] array = new int[10];
		
		//합계, 평균을 구하기 위한 변수 생성
		int sum = 0;
		double avg = 0;
		
		//for문을 이용하여 값을 넣어주고, 합계 변수를 이용하여 값을 집어넣는다.
		for(int i=0; i<10; i++) {
			array[i] = r.nextInt(100)+1;
			sum +=array[i];
		}
		//입력된 배열 출력
		System.out.println("입력된 배열 : " + Arrays.toString(array));
		System.out.println("총합 : " + sum);
		//평균 출력
		avg = (double)sum / array.length;
		System.out.println("인덱스의 평균 : " + avg );
	}

}
