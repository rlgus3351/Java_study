package Ex03객체지향실습;

public class Student {

	// 학생 성적관리 class

//1.필드
	// 이름
	private String name;
	// 학번
	private String number;
	// 나이
	private int age;
	// Java점수
	private int scoreJava;
	// Web점수
	private int scoreWeb;
	// Android점수
	private int scoreAndroid;

	// 생성자 메소드
	// 생성자 메소드 특징
	// 1. 리턴타입이 지정하지 않는다.(void도 작성하지 않는다)
	// 2. 메소드 이름은 반드시 클래스 명과 똑같아야 한다.
	// ----> 대소문자까지 동일해야한다.
	// 3. new 키워드를 사용할 때 호출되는 메소드(객체를 생성시 사용된다.)
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		// 생성자 메소드 = 클래스 명 똑같다.
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;

	}

	public Student() {
		// 기본 생성자.
	}

	// 2. 메소드
	// getter /setter 단축키 : Alt + Shift + s
	// 2-1) getter 메소드
	// : private으로 숨겨져 있는 필드의 데이터에 접근
	// 다른 클래스에서 데이터를 가져갈 수 있게 만들어주는 메소드
	public String getName() {
		return name;
	}

	// 2-2) setter 메소드
	// : private으로 숨겨져 있는 필드의 데이터를 수정하고 싶을 때 사용한다.
	// 사용하는 메소드
	public void setName(String name) {
		this.name = name;
		// 동일한 변수명을 사용하진 않지만, 접근 제한자를 사용하여 같은
		// 필드에 넣어줄때는 같은 매개변수(동일한변수명)을 사용하여 적는다.
		// this 키워드 --> 현재 코드 작업하고 있는 클래스 자체를 의미
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
