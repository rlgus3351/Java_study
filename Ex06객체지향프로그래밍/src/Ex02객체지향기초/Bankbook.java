package Ex02객체지향기초;

public class Bankbook {

	// 1. 필드(속성, 데이터)
	// 잔액
	int money;

	// 2. 메소드(기능)
	// 입금하다.
	public void deposit(int inputMoney) {
		money = money + inputMoney;
	}

	// 출금하다.
	public void withdraw(int inputMoney) {
		money -= inputMoney;
	}

	// 조회하다.
	public void showMoney() {
		System.out.printf("현재 잔액 : %d원\n", money);
	}

}
