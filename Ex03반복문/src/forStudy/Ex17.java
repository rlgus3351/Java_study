package forStudy;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 17. 다음과 같은 별 모양으로 출력하세요.
		
		//    **
		//   ****
		//  ******	
		// ********
		//**********
		//**********
		// ********
		//  ******	
		//   ****
		//    **
		
		
		//문제 15. 다음과 같은 별 모양으로 출력하세요.
		
		//    **
		//   ****
		//  ******	
		// ********
		//**********
		//다중 포문
//		int num = 2;
//		for(int i=0; i<5; i++) {
//			for(int j = 4; j>i; j--) {
//				System.out.print("1");
//			}
//			for(int k = 1; k<=num; k++) {
//				System.out.print("*");
//			}
//			num =num +2;
//			System.out.println();
//		}
//		
//		//문제 16. 다음과 같은 별모양을 만드시요.
//		//**********
//		// ********
//		//  ******	
//		//   ****
//		//    **
//		
//		int num = 10;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=num; k++) {
//				System.out.print("*");
//			}
//			num -=2;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		int num = 2;
		for(int i=1; i<=10; i++) {
			if (i<=5) {
				for(int j = 5; j>i; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k<=num; k++) {
					System.out.print("*");
				}
				num =num +2;
			}else {
				num = num-2;
				for(int j = 6; j<i; j++) {
					System.out.print(" ");
				}
				for(int k = 1; k<=num; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
