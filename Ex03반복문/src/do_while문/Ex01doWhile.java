package do_while문;

public class Ex01doWhile {

	public static void main(String[] args) {

		// do-while
		// while 같은 경우에는 조건을 먼저 본 후 반복 실행
		// do-while 같은 경우에는 일단 무조건 한번 반복 실행 후 조건보기

		// do{
		// 조건에 만족했을때 실행할 코드 작성
		// (단 여기안에 코드는 무조건 한 번은 실행
		// }while(조건식);

		// do-while을 사용해서 1부터 10까지의 숫자를 출력

		int num = 1;

		do {
			System.out.println(num);
			num++;
		} while (num <= 10);

	}

}
