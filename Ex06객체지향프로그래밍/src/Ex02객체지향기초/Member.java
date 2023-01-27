package Ex02객체지향기초;

public class Member {
	// 설계도

	// 1. 필드 (data, 속성)

	// 이름
	String name;
	// 연락처
	String phone;
	// 생년월일
	int birth;
	// 성별
	char gender;
	// 나이
	int age;

	// 2. 메소드(logic, 기능)

	// 회원가입(이름, 나이 입력)
	public void join(String inputName, int inputAge) {
		name = inputName;
		age = inputAge;
		System.out.println("회원 가입 완료~~");
	}

	// 로그인
	public void login() {
		System.out.println(name + "이/가 로그인한다.");
	}

}
