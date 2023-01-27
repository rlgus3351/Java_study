package forStudy;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 13. 다음과 같은 별 모양으로 출력하세요
		// *
		// **
		// ***
		// ****
		// *****
		
		
//		//*
//		for(int i=1; i<=1; i++) {
//			System.out.print("*");
//		}
////		System.out.println();
//		
//		//**
//		for(int i=1; i<=2; i++) {
//			System.out.print("*");
//		}
////		System.out.println();
//		
//		//***
//		for (int i=1; i<=3; i++) {
//			System.out.print("*");
//		}
////		System.out.println();
//		
//		//다중 for문 
	
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
