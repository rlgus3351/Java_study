package forStudy;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 14. 다음과 같은 별 모양으로 출력하세요.
		//*****
		//****
		//***
		//**
		//*
		
//		1. 감소 연산자를 사용하는법.
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
