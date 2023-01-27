package 일차원배열;


public class Ex02배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제.
		// 길이가 10인 정수형 배열 array를 만들고
		// 인덱스 0부터 9까지 배열 안에
		// 1부터 10까지 값을 넣어주세요.
		
		int[] array = new int[10];
		//array.length -----> 배열의 길이를 알 수 있다.
		for(int i=0; i<array.length; i++) {
			array[i]= i+1;
			System.out.print(array[i]+" ");
		}
	}

}
