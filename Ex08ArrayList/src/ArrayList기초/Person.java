package ArrayList기초;

public class Person {

	// 설계도

	// 1. 필드(속성, 데이터)
	private String name;
	private int age;

	// 2. 메소드(행위)
	// 2-1. 생성자(모든 필드 초기값 채우는 생성자)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 2-2. 모든 필드에 getter메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}

}
