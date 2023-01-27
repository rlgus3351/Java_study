package switch문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.월 입력 받기
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch(month){
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "겨울";
			break;
		default:
			season = "계절이 X";
			break;
		}
		System.out.println(month+ "월은 " + season +"입니다!");
		sc.close();
	}

}
