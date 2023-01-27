package javaproject;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 아래와 같이 학생들의 성적정보가 문자열로 선언되어있을 때 각 성적 별 학생 수를 출력하시오.
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		// 문자열 score를 split을 사용하여 ,기호로 나누어 text배열에 저장한다.
		String[] text = score.split(",");
		int cntA = 0; // A의 점수 초기화
		int cntB = 0; // B의 점수 초기화
		int cntC = 0; // C의 점수 초기화
		int cntD = 0; // D의 점수 초기화
		int cntF = 0; // F의 점수 초기화
		for (int i = 0; i < text.length; i++) {// 텍스트 인덱스 0번부터 길이-1까지 진행
			if (text[i].equals("A")) { // A판별시 A점수 1증가
				cntA++;
			} else if (text[i].equals("B")) {// B판별시 B점수 1증가
				cntB++;
			} else if (text[i].equals("C")) {// C판별시 C점수 1증가
				cntC++;
			} else if (text[i].equals("D")) {// D판별시 D점수 1증가
				cntD++;
			} else {// F판별시 F점수 1증가
				cntF++;
			}
		}
		// 각 등급별로 명수 출력.
		System.out.printf("A: %d명\n", cntA);
		System.out.printf("B: %d명\n", cntB);
		System.out.printf("C: %d명\n", cntC);
		System.out.printf("D: %d명\n", cntD);
		System.out.printf("F: %d명", cntF);

	}

}
