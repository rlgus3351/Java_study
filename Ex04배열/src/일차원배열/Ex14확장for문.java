package 일차원배열;

public class Ex14확장for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for-each (확장for문)
		// -배열 안에 값을 순차적으로 꺼낼때 편리한 for문

		int[] array = { 5, 7, 12, 2, 34, 26, 1, 2, 4, 1 };
		
		//기존 방식
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//for-each (확장 for문) 방식
		//for(배열의 값을 꺼냈을 때 변수: 사용하고 싶은 배열) {}
		System.out.println();
		for(int num: array) {
			System.out.print(num + " ");
		}

	}

}
