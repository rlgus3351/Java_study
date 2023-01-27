package arrayStudy;

import java.util.Arrays;
import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 1차원 정수형 배열을 선언한 후 임의의 값으로 초기화한다.
		// 배열의 값중 가장 큰 값을 찾아 출력하는 프로그램을 작성

		// 1.랜덤 가져오기
		Random r = new Random();

		// 2. int형 배열은 선언, 최대값을 담을 변수 선언
		int[] array = new int[10];
		int max = 0;
		// 3. for문으로 랜덤값 할당해주기
		for (int i = 0; i < 10; i++) {
			array[i] = r.nextInt(100) + 1;
			// 4. 조건문을 통해 최대값 판별해주기
			if(max < array[i]) {
				max = array[i];
			}
		}
		// 5. 출력
		System.out.println("입력된 배열은 : " + Arrays.toString(array));
		System.out.printf("가장 큰 값은 %d 입니다.", max);

	}

}
