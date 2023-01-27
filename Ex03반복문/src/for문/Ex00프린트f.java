package for문;

public class Ex00프린트f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 나이 연락처
		String name = "권기현";
		int age = 24;
		String phone_number = "010-1234-5678";

		
		// %s : String(문자열)
		// %d : decimal(정수, 10진수)
		// %f : float(실수)
		// %n : new 엔터를 친다.
		
		// 이름 : 권기현/나이 : 24(세) / 전화번호 : 010-1234-5678
		System.out.println("이름 : " + name + " / 나이 : " + age + "(세)" + " / 전화번호 : " + phone_number);
		System.out.printf("이릅 : %s / 나이 : %d(세) / 전화번호 : %s%n",name,age,phone_number);
	}

}
