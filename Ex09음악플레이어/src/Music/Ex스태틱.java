package Music;

public class Ex스태틱 {

	public static void main(String[] args) {

		// 5, 3이라는 정수를
		// add라는 메소드를 통해 연산
		// 결과값 console에 출력

		Ex스태틱 ex = new Ex스태틱();
		System.out.println(ex.add(5, 3));
//		new Ex스태틱().add(0, 0);
		System.out.println("출력됨!");
	}
	// MVC  
	// Model
			//DTO : Data Transform object
			//DAO : Data Access object 
	// View  : main 패키지
	// controller : 동작?
	
	public int add(int num1, int num2) {

		return num1 + num2;
	}

}
