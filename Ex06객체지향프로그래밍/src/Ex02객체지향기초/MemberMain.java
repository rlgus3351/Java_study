package Ex02객체지향기초;

public class MemberMain {

	// 실행하는 공간, 객체를 생성할 수 있는 공간
	public static void main(String[] args) {

		// 1. 클래스를 기반으로 객체를 만들기

		Member m1 = new Member();
		Member m2 = new Member();
		// 객체 생성
		// 자료형 변수명 = new 자료형();
//		System.out.println(m1); --->  주소 출력
//		System.out.println(m1.name); ---> String 기본형 null
//		System.out.println(m1.age); ---> int 기본형 0

		m1.join("권기현", 26);
		System.out.println(m1.name);
		System.out.println(m1.age);
		m1.phone = "010-1234-5678";
		m1.birth = 980928;
		m1.gender = 'm';
		System.out.println(m1.phone);
		System.out.println(m1.birth);
		System.out.println(m1.gender);
		// 2.
		
		m2.join("심형선", 20);
		System.out.println(m2.name);
		System.out.println(m2.age);
		m2.phone = "010-4611-3057";
		m2.birth = 20030331;
		m2.gender = 'm';
		System.out.println(m2.phone);
		System.out.println(m2.birth);
		System.out.println(m2.gender);

	}

}
