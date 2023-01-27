package Ex02객체지향기초;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행 공간

		// 객체 만들기
		Bankbook bank1 = new Bankbook();
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 : ");
		int num1 = sc.nextInt();
		bank1.deposit(num1); // 입금
		bank1.showMoney(); // 잔액조회

		System.out.print("출금할 금액 입력 : ");
		int num2 = sc.nextInt();
		bank1.withdraw(num2); // 출금
		bank1.showMoney(); // 잔액조회

		sc.close();
	}

}
