package javaproject;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 for문을 사용하여 A~Z까지 출력하시오.
		// A의 유니코드 10진수 값은 65
		// B의 유니코드 10진수 값은 66
		// .....................
		// Z의 유니코드 10진수 값은 90
		
		
		int num = 65; //65부터 1씩 더하여 진행하기 위해 미리 A의 유니코드 10진수 값을 집어넣는다.		-->> A의 값이 65이므로 

		for (int i = 0; i < 26; i++) { //초기값 0부터 26보다 작을 때까지 (알파벳 개수 26개) 
			char text = (char) num; // 정수형 num 값을 형변환하여 text에 집어넣어준다.
			System.out.print(text + " ");	//출력
			num++;//65부터 90까지 진행되기 위한 증감연산자
		}

	}

}
