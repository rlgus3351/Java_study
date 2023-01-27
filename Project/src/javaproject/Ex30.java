package javaproject;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ----------------------//
		// 6 2 5 5 4 5 6 3 7 6 //
		// ----------------------//
		// 스캐너 가져오기, 입력하세요 문구 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력하세요. >> ");
		String text = sc.next(); // text에 입력받은 숫자 저장
		String[] test = text.split(""); // 숫자를 split함수를 사용하여 test에 나누어 저장

		int sum = 0; // 대시의 총합을 담아줄 변수sum 저장
		for (int i = 0; i < test.length; i++) {
			switch (test[i]) { // test의 값을 switch문에 저장하여 값을 비교 해당 값에는 대시의 개수를 더해주는 문장이 있다.
			case "0", "6", "9":
				sum += 6;
				break;
			case "1":
				sum += 2;
				break;
			case "2", "3", "5":
				sum += 5;
				break;
			case "4":
				sum += 4;
				break;
			case "7":
				sum += 3;
				break;
			case "8":
				sum += 7;
				break;
			}
		}

		System.out.printf("대시('-')의 총 합 >> %d", sum); // 출력
	}

}
