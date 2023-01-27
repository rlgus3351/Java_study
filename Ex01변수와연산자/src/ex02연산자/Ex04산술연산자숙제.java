package ex02연산자;

import java.util.Scanner;

public class Ex04산술연산자숙제 {

	public static void main(String[] args) {
		// Java, Web, Android 점수를 키보드로 부터 입력 받아 합계와 평균을 출력하세요.
		//1. 스캐너 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
	    //2. 사용자에게 점수를 입력받기
	    // Java Score 입력
	    System.out.print("Java 점수 입력 : ");
	    //3. 변수 생성
	    int javaScore = sc.nextInt();
	    
	    // Web Score 입력
	    System.out.print("Web 점수 입력 : ");
	    int webScore = sc.nextInt();
	    
	    // Android Score
	    System.out.print("Android 점수 입력 : ");
	    int androidScore = sc.nextInt();
	    
	    //4. 합계 구하기
	    int totalScore = javaScore + webScore + androidScore;
	    System.out.println("총 합계 : "  + totalScore);
	    
	    //5. 평균 구하기
	    int average = totalScore / 3;
	    System.out.println("평균 : "  + average);
	   
	    sc.close();
	}
	
}
