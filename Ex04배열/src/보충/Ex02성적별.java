package 보충;

import java.util.Arrays;

public class Ex02성적별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// split 문자열을 해당 기호, 나누어 주는 작업
//		String[] text = score.split(",");
		// charAt(인덱스번호) : String으로 저장된 문자열 중 한 문자를 char타입으로 변환

		int cntA = 0; // A학점 카운트
		int cntB = 0; // B학점 카운트
		int cntC = 0; // C학점 카운트
		int cntD = 0; // D학점 카운트
		int cntF = 0; // F학점 카운트
//------------------------------------------------------Case 1---------------------------------------------------//
//		for (int i = 0; i < score.length(); i++) {
//			if (score.charAt(i) == 'A') {
//				cntA++;
//			} else if (score.charAt(i) == 'B') {
//				cntB++;
//			} else if (score.charAt(i) == 'C') {
//				cntC++;
//			} else if (score.charAt(i) == 'D') {
//				cntD++;
//			} else if (score.charAt(i) == 'F'){
//				cntF++;
//			} //쉼표는 제외시키기 위함.
//
//		}
//		-------------------------------------------------Case 2---------------------------------------------------//
		for (int i = 0; i < score.length(); i+=2) {
			if (score.charAt(i) == 'A') {
				cntA++;
			} else if (score.charAt(i) == 'B') {
				cntB++;
			} else if (score.charAt(i) == 'C') {
				cntC++;
			} else if (score.charAt(i) == 'D') {
				cntD++;
			} else if (score.charAt(i) == 'F'){
				cntF++;
			} //쉼표는 제외시키기 위함.

		}
		
	
//		-------------------------------------------------Case 3---------------------------------------------------//
//		System.out.println(Arrays.toString(text));

//		for (int i = 0; i < text.length; i++) {
//			if (text[i].equals("A")) {
//				cntA++;
//			} else if (text[i].equals("B")) {
//				cntB++;
//			} else if (text[i].equals("C")) {
//				cntC++;
//			} else if (text[i].equals("D")) {
//				cntD++;
//			} else {
//				cntF++;
//			}
//		}
		System.out.printf("A : %d명\n", cntA);
		System.out.printf("B : %d명\n", cntB);
		System.out.printf("C : %d명\n", cntC);
		System.out.printf("D : %d명\n", cntD);
		System.out.printf("F : %d명", cntF);

	}

}
