package 일차원배열;

public class Ex01배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		// - 동일한 데이터 타입이 순차적으로 저장되어 있는 것
		// 배열의 특징
		// 1. 배열의 크기는 고정적이며 변경할 수 없다.
		// 2. 배열 안에 데이터를 저장하거나 불러오기 위해 숫자를 매겨놨으며
		// 이 숫자를 우리는 인덱스라고 부르며 인덱스는 0부터 시작
		// 3. 배열은 레퍼런스 변수에 속하며 레퍼런스 변수는 값을 저장하는게 아니라
		// 주소를 저장한다.

		// 길이가 5인 정수형 배열 array 만들기
		int[] array = new int[5];
		System.out.println(array); //5칸의 배열이 있는 주소 값
		array[0] = 10;
		System.out.println(array[0]);
		array[1] = 20;
		System.out.println(array[1]);
		array[2] = 30;
		System.out.println(array[2]);
		array[3] = 40;
		System.out.println(array[3]);
		array[4] = 50;
		System.out.println(array[4]);
		
//		array[5] = 60; //컴파일은 되지만 실행이 되진 않는다.
		// 인덱스의 경계선을 넘는 예외 ---> ArrayIndexOutOfBoundsException
		// 컴파일러는 배열의 크기를 모르며, 대입과 순서대로 하므로 마지막 5번째 값입력은 안된다.
		
		
		
	}

}
