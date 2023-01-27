package 일차원배열;

public class Ex03배열심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열을 만드는 방법
		// -길이가 3인 정수형 배열 만들기, 각 인덱스에는 10, 20, 30이 들어간다.

		// 어떠한 값이 들어갈지 모를때 설정.
		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;

		// 길이와 값을 정확하게 알고 있을 때
		int[] array2 = { 10, 20, 30 };
//		System.out.println(array2[0]);s

		// 배열의 복사
		int[] array3 = { 10, 20, 30, 40, 50 };
		int[] array4 = array3;
		array3[3] = 100;
		System.out.println(array3[3]);
		System.out.println(array4[3]);
		
		
	}

}
