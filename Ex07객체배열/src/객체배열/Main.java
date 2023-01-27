package 객체배열;

public class Main {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형 [] 배열이름 = new 자료형[배열 크기];
		// 포켓몬 자료형을 3개 보관할 수 있는 bag이라는 배열 생성
		Pokemon[] bag = new Pokemon[3];

		// 객체 배열 인덱스 0~2번까지

		// 객체 배열 0번 인덱스에 포켓몬 넣어보기
		// 이름 : 피카츄
		// 타입 : 전기
		// 스킬 : 백만볼트
		// hp : 1000
		// atk : 100

		// 1) 객체 생성하기
		bag[0] = new Pokemon("피카츄", "전기", 1000, 100, "백만볼트");
//		System.out.println(bag[0].getName());

		// 1번 인덱스 >> 파이리/불/1000/120/불꽃발사
		// 2번 인덱스 >> 꼬부기/물/1000/130/물대포

		bag[1] = new Pokemon("파이리", "불", 1000, 120, "불꽃발사");
		bag[2] = new Pokemon("꼬부기", "물", 1000, 130, "물대포");

		System.out.println("====포켓몬 정보 출력=====");
		for (int i = 0; i < bag.length; i++) {
			System.out.print(bag[i].getName() + "\t" + bag[i].getType() + "\t" + bag[i].getHp());
			System.out.println();
		}	
		// for-each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용합니다.
		// 동작 원리
		// 배열 안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		// : 기준 좌측에 있는 변수에 담아주는 흐름을 가진다.
		for (Pokemon p : bag) {
			System.out.print(p.getName() + "\t" + p.getType() + "\t" + p.getHp() + "\n");
		}
	}

}
