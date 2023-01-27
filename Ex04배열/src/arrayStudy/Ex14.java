package arrayStudy;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 스캐너로 입력받은 이름이 몇 번째 인덱스에 저장되어 있는지 검색하는 프로그램을 작성하시오.

		// 1. 스캐너 가져오기
		Scanner sc = new Scanner(System.in);

		// 2. name배열에 각각의 이름으로 초기화
		String[] name = { "왕지강", "권기현", "이세미", "심형선", "김호원" }; // name배열에 {}안에 있는 값을 각각의 인덱스에 대입한다.
		// 2-1. 검색할 이름을 입력하세요. 구문 출력
		System.out.print("검색 할 이름을 입력하세요 >> ");
		// 2-2 입력받은 이름은 문자열타입 변수에 저장.
		String answer = sc.next();

		// 3. for문을 이용하여 조건에 맞는 배열의 위치와 인덱스 찾기
		for (int i = 0; i < name.length; i++) { // for_start
			if (answer.equals(name[i])) { // answer의 값과 array[i]번째의 같을 때 해당 i값을 출력하는 for 문 a
				// 문자열 비교 = a.equals(b)
				System.out.print(answer + "님은 " + (i + 1) + " 번째 인덱스에 저장되어 있습니다.");
			}
		} // for_end

	}

}
