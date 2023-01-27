package forStudy;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 다음과 같은 별 모양으로 출력하세요.
		//     **
		//    ****
		//   ******
		//  ********
		// **********

		// 1111**
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j > 4; j--) {
//				System.out.print(1);
//			}
//			for (int k = 0; k < 2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 111****
//		for (int i=0; i<1; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(1);
//			}
//			for (int k=0; k<4; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 11******
//		for (int i=0; i<1; i++) {
//			for(int j=0; j>2; j--) {
//				System.out.print(1);
//			}
//			for(int k=0; k<6; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//1********
//		for(int i=0; i<1; i++) {
//			for(int j=0; j>1; j--) {
//				System.out.print(1);
//			}
//			for(int k=0; k<8; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
////		}
//		
//		//***********
//		for(int i=0; i<1; i++) {
//			for(int j=0; j>i; j--) {
//				System.out.print(1);				
//			}
//			for(int k=0; k<10; k++) {
//				System.out.print("*");
//			}
//
//		}
		int num = 2;
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<num; k++) {
				System.out.print("*");
				
			}
			num +=2;
			System.out.println();
		}

		
		
	}

}
