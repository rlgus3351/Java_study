package forStudy;

public class Ex15 {

	public static void main(String[] args) {
		//문제 15. 다음과 같은 별 모양으로 출력하세요.
		
		//    **
		//   ****
		//  ******	
		// ********
		//**********
		
		
//		//aaaa**aaaa     
//		for(int i=0; i<1; i++){//1번 반복
//			for(int j=4; j>i; j--) {//빈칸 횟수는 4번 처음에부터 4번째까지 빈칸 출력 구문(빈칸의 개수를 확인하기 위해서 a로 설정)
//				System.out.print("a");
//			}
//			for(int k = 1; k<=2; k++) {//별찍어 놓기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//aaa****aaa     
//		for(int i=0; i<1; i++){//1번 반복
//			for(int j=3; j>i; j--) {//빈칸 횟수는 4번 처음에부터 4번째까지 빈칸 출력 구문(빈칸의 개수를 확인하기 위해서 a로 설정)
//				System.out.print("a");
//			}
//			for(int k = 1; k<=4; k++) {//별찍어 놓기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//aa******aa     
//		for(int i=0; i<1; i++){//1번 반복
//			for(int j=2; j>i; j--) {//빈칸 횟수는 4번 처음에부터 4번째까지 빈칸 출력 구문(빈칸의 개수를 확인하기 위해서 a로 설정)
//				System.out.print("a");
//			}
//			for(int k = 1; k<=6; k++) {//별찍어 놓기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//a********a     
//		for(int i=0; i<1; i++){//1번 반복
//			for(int j=1; j>i; j--) {//빈칸 횟수는 4번 처음에부터 4번째까지 빈칸 출력 구문(빈칸의 개수를 확인하기 위해서 a로 설정)
//				System.out.print("a");
//			}
//			for(int k = 1; k<=8; k++) {//별찍어 놓기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//**********     
//		for(int i=0; i<1; i++){//1번 반복
//			for(int j=0; j>i; j--) {//빈칸 횟수는 4번 처음에부터 4번째까지 빈칸 출력 구문(빈칸의 개수를 확인하기 위해서 a로 설정)
//				System.out.print("a");
//			}
//			for(int k = 1; k<=10; k++) {//별찍어 놓기
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//다중 포문
		int num = 2;
		for(int i=0; i<5; i++) {
			for(int j = 4; j>i; j--) {
				System.out.print("1");
			}
			for(int k = 1; k<=num; k++) {
				System.out.print("*");
			}
			num =num +2;
			System.out.println();
		}
	}

}
