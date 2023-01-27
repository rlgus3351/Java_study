package Ex03객체지향실습;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//---------------------------stu1-----------------------//
		// 객체 생성
		Student stu1 = new Student();
		// Student() : 생성자 (constructor)
		// 1) 기본생성자 (default constructor)
		// : 매개변수가 없는 생성자를 의미
		// ----> 기본 생성자는 생략이 가능하다.
		// 3. new 키워드를 사용할 때 호출되는 메소드(객체 생성시 사용됨)
		// 4. 기본생성자 (매개변수가 없는 생성자)는 생략이 가능
		// 5. 개발자가 새로운 생성자를 만들어내면, 기본생성자는 사라진다.!!
		// --> 기본생성자를 살리고싶다면?
		// --> 생성자를 오버로딩(중복정의) 하면 된다.!
		// 6. 생성자는 하나 이상 선언되어야 한다.

		stu1.setName("채수민");
		stu1.setNumber("20220878");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);

		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
//----------------------------stu2----------------------//
		Student stu2 = new Student("임경남", "20220458", 20, 50, 99, 77);
		System.out.println(stu2.getName());
		System.out.println(stu2.getScoreAndroid());

	}

}
