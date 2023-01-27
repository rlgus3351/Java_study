package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// 0일때 cnt ++
		// x일때 cnt 초기화 0, cnt++
		// 스캐너 가져오기, 채점하기 출력문
		Scanner sc = new Scanner(System.in);
		System.out.println("========채점 하기=========");

		String answer = sc.next(); // answer로 입력받은 값 가져오기
		String[] array = answer.split(""); // answer의 값을 string 타입의 array배열에 넣어주기
		int cnt = 0; // 점수로 이용할 변수 cnt 선언
		int sum = 0; // 총점수로 이용할 변수 sum 선언

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("O") || array[i].equals("o")) { // 배열의 값이 O,o이면 cnt를 올려 1점을 준다, 값은 sum에 더하여 저장
				cnt++;
				sum += cnt;
			} else { // x이면 cnt의 값을 0으로 초기화
				cnt = 0;
			}
		}

		System.out.println(sum); // 총점 출력

	}

}
