package javaproject;

import java.util.Random;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
		// 로또 번호 : 1~50
		Random r = new Random(); // 랜덤함수 가져오기
		int[] num = new int[6]; // 로또 번호는 6자리이므로 로또 번호를 담을 배열 저장
// ------------------------------------------번호를 뽑아 값 넣기-------------------------------------------------//
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50) + 1; // 1부터 50까지 숫자를 받기 위해
			for (int j = 0; j < i; j++) {// 비교할 값으로 이전의 인덱스의 값을 비교하기 위한 for_J문
				if (num[j] == num[i]) { // 이전의 값과 같으면 다시 돌아가서 뽑으라는 말.
					i = i - 1; // 다시 돌아가서 뽑아라
					break;
				}
			}
		}
//------------------------------------------배열 출력------------------------------------------------//
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
