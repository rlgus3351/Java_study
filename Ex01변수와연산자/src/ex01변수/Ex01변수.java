package ex01변수;

public class Ex01변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석 - 아래의 코드가 무엇인지 설명을 해야 할 때 사용
		//       주석 안에 작성된 글자는 컴퓨터가 컴파일 하지 않고 넘어 간다.
		// 한줄 주석
		/*여러 줄의 주석 */ 

		// 안내 - 코드를 실행하는 순간 무조건 위에서 아래로 실행이 된다.
		// Java의 실행과정
		// Ex01변수.java -> 컴파일 -> Ex01변수.class 파일로 변환 -> JVM -> 실행
		// Java에서 문자열은 ""안에 작성한다.
		System.out.println("Hello World!");
		System.out.println("권기현");
	
		// 출력문 자동완성 -> syso + 컨트롤 + 스페이스
		System.out.println("하하하하");
		
		// 변수 - 데이터를 저장하는 임시적인 공간
		// 변수를 만드는 방법
		// 자료형 변수명 대입연산자 값; 
		// int a = 3;
		// 실습 정수를 담을 수 있는 변수 num을 선언(정의, 만들다) 후 100으로 할당
		//int num = 100;
		int num;
		num = 100;
		
		System.out.println(num);
		
		num = 50;
		System.out.println(num);
		
		// 변수의 특징
		// 1. 변수 안에 새로운 값이 들어오게 된다면 이전의 값은 사라진다.
		// 2. 동일한 이름으로 변수를 만들 수 없다.
		
		// 문제. 
		int myMoney = 15000;
		int yourMoney = 90000000;
		/////////////////////////////////////////////////
	
		int temp = myMoney;
		myMoney = yourMoney;
		yourMoney = temp;
		
		/////////////////////////////////////////////////
		System.out.println("나의 금액 : " + myMoney + "원");
		System.out.println("친구의 금액 : " + yourMoney + "원");

		
	}

}
