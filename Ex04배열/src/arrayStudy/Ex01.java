package arrayStudy;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		//문제1. 배열 array의 각각에 인덱스에 들어있는 모든 데이터를 출력하세요.
		//int형이고 길이가 10인 array 배열 생성
		int[] array = new int[10];
		
		//랜덤한 값을 입력하기 위해서 랜덤 호출, import
		Random r = new Random();
		
		//for문을 이용하여 10번 인덱스 번호별로 랜덤수 할당.
		for(int i=0; i<10; i++) { //for문 시작
			array[i] = r.nextInt(100)+1; //1~100까지의 난수를 배열에 순서대로 입력
			System.out.print(array[i]+ " "); // 출력문
		}//for문 끝
		
		
		
		}

}
