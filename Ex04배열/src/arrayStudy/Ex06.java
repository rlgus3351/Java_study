package arrayStudy;

import java.util.Arrays;
import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 배열의 값 중 홀수인 값이 몇 개인지 출력하는 프로그램을 작성하세요.
		
		//1.랜덤 가져오기
		Random r = new Random();
		//2.int형이면서 길이가 10인 배열 array 생성, 홀수 갯수 변수 생성
		int[] array = new int[10];
		int count = 0;
		//3.for문을 이용하여 랜덤난수 배열에 할당하기
		for(int i=0; i<10; i++) {
			array[i] = r.nextInt(100)+1;
			//3-1. 홀수 판별하여 출력하기
		}
		System.out.println("입력된 난수에 의한 배열 : " + Arrays.toString(array));
		int[] odd_num = array;
		System.out.print("Array에 들어있는 홀수는: ");
		for(int i=0; i<10; i++) {
			if(odd_num[i]%2==1) {
				System.out.print(odd_num[i]+ " ");
				count ++;
			}
		}
		System.out.printf("로 총 %d개 입니다.", count);
		//3-2. 홀수 판별된 갯수 출력하기

	}

}
