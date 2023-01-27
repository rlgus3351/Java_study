package ex01변수;

public class Ex03변수의특징과형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수명 규칙
		// 1.변수명을 지을 때는 되도록이면 의미가 있는 이름으로 지을 것
		// 2.Java에서는 변수명에 키워드를 사용할 수 없다.(예 : abstract, for, if 등)
		// int super = 10;
		// 3. Java는 변수명에 대 소문자가 구분되며 변수명의 길이는 제한이 없다.
		// 4. 변수명을 숫자로 시작할 수 없다.
		// 5. 특수문자는 '_'와 '$'만 허용된다.

		String name_age = "권기현/26";
		String 이름 = "권기현";
		int Num1 = 10;
		int num1 = 10;
		
		// 형변환 - 자료형태를 변환하는 것
		// byte (1byte) -> int (4byte)
		// 작은 자료형에서 큰 자료형으로 데이터를 담을 때는 아무런 이상없이 담을 수 있다.
		// 이것을 자동(묵시적)형변환 이라고 한다.
		byte age1 = 100;
		int age2 = age1;
		
		// int (4byte) -> byte(1byte)
		// 큰 자료형에서 작은 자료형으로 데이터를 담을 때는 혹시라도 데이터가 누출되는(오버플로우)
		// 발생할 수 있기 때문에 작은 자료형으로 변환하기 위해서는 강제로 데이터 타입을 명시 해야 함
		// 이것을 강제(명시적)형변환 이라고 부른다.
		byte age3 = (byte)age2;
		byte age4 = age1;
		
		int num7 = 537;
		byte num8 = (byte)num7;
		System.out.println(num8);
		
		// 정수와 실수의 형변환 
		// 같은 크기의 정수와 실수형 변수가 있다면 
		// 정수 -> 실수로 자동(묵시적) 형변환이 일어나고
		// 실수 -> 정수로 변환하기 위해서는 강제(명시적)형변환을 해야한다.
		// 이 과정 중에 실수의 소수점은 사라지게 된다.
		int num9 = 100;
		float num10 = num9;
		
		float num11 = 3.14F;
		int num12 = (int)num11;
		
		System.out.println(num12);
		
		
		

	}

}
