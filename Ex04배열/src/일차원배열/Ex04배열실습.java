package 일차원배열;

import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] array = new int[10]; //int형 배열 array 크기 10으로 생성
		System.out.print("Array에 들어있는 짝수는 "); //배열 안에 들어있는 짝수 출력 문구
		
		for(int i=0; i<array.length; i++) { //초기값 0부터 배열의 길이까지 반복되는 조건으로 해당 값부터 배열의 길이까지 값을 대입시키기위해
			int randomNumber = r.nextInt(100)+1; //랜덤값으로 (0<=x<1)*100 + 1하면 1부터 101번째까지 값이 나온다.
			array[i] = randomNumber; //배열에 랜덤된 값을 대입
//			System.out.println(Arrays.toString(array));
			if(array[i] % 2==0) { //그 배열안에 있는 값이 짝수일시 출력
				System.out.print(array[i] + " "); //배열의 값이 짝수일 때 출력문+ 띄어쓰기
			}
			
			
		}
		System.out.println("입니다.");
	}

}
