package PokemonGame;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 1) 포켓몬 2마리 생성
		// 이상해꽃/ 풀/ 1000/ 150/덩굴채찍
		// 피카츄 / 전기/ 1000/ 100/ 백만볼트
		Pokemon flower = new Pokemon("이상해꽃", "풀", 1000, 150, "덩굴채찍");
		Pokemon pika = new Pokemon("전기", "전기", 1000, 100, "백만볼트");

		// 2) 사용자에게 메뉴 보여주기
		while (true) {
			System.out.println("=====포켓몬 선택하기=====");
			System.out.print("[1] 이상해꽃 [2] 피카츄 >>>");
			int choice = sc.nextInt();

			// 3) 사용자가 입력한 값 구분하기
			if (choice == 1) {
				// 사용자가 이상해꽃 선택!
				System.out.println("====공격 패턴 선택====");
				System.out.print("[1] 일반 공격 [2] 스킬 공격 >>>");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					// 이상해꽃이 피카츄를 일반 공격
					// 피카츄의 hp =피카츄의 hp -이상해꽃의 atk
					pika.setHp(pika.getHp() - flower.getAtk());
					System.out.println("이상해풀 공격~!");

				} else {
					// 이상해꽃이 피카츄를 스킬 공격
					// 피카츄의 hp = 피카츄의 hp - 이상해꽃의 atk*1.5
					pika.setHp((int) (pika.getHp() - 1.5 * flower.getAtk()));
					System.out.println("이상해풀 스킬 공격!!");
					System.out.println(flower.getSkill());

				}

			} else if (choice == 2) {
				// 사용자가 피카츄 선택!
				// 피카츄가 이상해꽃을 일반 공격
				// 이상해꽃의 hp =이상해꽃의 hp -피카츄의 atk
				System.out.println("====공격 패턴 선택====");
				System.out.print("[1] 일반 공격 [2] 스킬 공격 >>>");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					flower.setHp(flower.getHp() - pika.getAtk());
					System.out.println("피카츄 공격~!");

				} else {
					// 이상해꽃이 피카츄를 스킬 공격
					// 이상해꽃의 hp = 이상해꽃의 hp - 피카츄의 atk*1.5
					flower.setHp((int) (flower.getHp() - 1.5 * pika.getAtk()));
					System.out.println("피카츄 스킬 공격!!");
					System.out.println(pika.getSkill());

				}

			} else {
				System.out.println("포켓몬을 다시 선택하세요~");
			}

			System.out.println("이상해꽃 채력 : " + flower.getHp());
			System.out.println("피카츄 채력 : " + pika.getHp());

			// 종료조건
			// 두 마리 중에 한 마리라도 체력이 0보다 작거나 같은 경우 프로그램 종료
			if (flower.getHp() <= 0 || pika.getHp() <= 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}

		}

	}

}
