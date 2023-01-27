package 메소드;

import java.util.Random;

public class Ex02다양한메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다양한 메소드 만들기

		// 매개변수 | 리턴 타입
		// 1.매개변수도 있고 리턴 타입도 있는 경우 o,o - 주스만들기
		System.out.println(makeJuice("딸기"));
		// 2.매개변수도 있고 리턴 타입은 없는 경우 o,x - 옷 정리하기
		clothes("맨투맨");
		// 3.매개변수는 없고 리턴 타입은 있는 경우 x,o - 랜덤과자 얻기
		System.out.println("오늘의 간식은 : " + randomSnack());
		// 4.매개변수도 없고 리턴 타입도 없는 경우 x,x - 다양한 인사
		hello();
	}

	// return이라는 키워드는 우측에 있는 데이터를 돌려주기도 하지만
	// 메소드가 끝나는 시점을 의미하기도 한다.(break랑 유사)
	public static void hello() {
		System.out.println("니하오마, 곤니찌와, 굿모닝, 안녕하세요.");
		return;
	}

	public static String makeJuice(String fruit) {
//		String result = "맛있는 "+ fruit + "주스 입니다.";
//		return result;
		return "맛있는 " + fruit + "주스 입니다.";
	}

	public static void clothes(String goods) {
		System.out.println(goods + " 잘 정리하겠습니다.");
	}

	public static String randomSnack() {
		Random r = new Random();
		String[] snacks = { "뻥이요", "브이콘", "신호등", "아폴로", "초콜릿" };
		return snacks[r.nextInt(snacks.length)];

	}

}
