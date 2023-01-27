package 일차원배열;

public class Ex12배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 돌아온 별 찍기
		// 별 카운트 갯수를 담을 정수형 배열 선언.
		int[] starCount = { 3, 4, 4, 2, 1 };

		for (int i = 0; i < starCount.length; i++) { // for_I_Start
			// starCount 배열 길이만큼 반복되야하므로 조건문
			System.out.print(starCount[i] + " : "); // starCount의 배열 숫자 만큼 별의 개수를 출력
			for (int j = 0; j < starCount[i]; j++) { // for_J_Start
				// 0부터 starCount의 인덱스 만큼 별의 개수를 출력하기위해서 for문 조건
				System.out.print("*");
			} // for_J_End
			System.out.println();

		} // for_I_End
	}

}
