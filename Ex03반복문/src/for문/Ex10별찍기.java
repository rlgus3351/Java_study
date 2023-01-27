package for문;

public class Ex10별찍기 {

	public static void main(String[] args) {
		
		
		// *
		// **
		// ***
		// ****
		// *****
		for(int i=1; i<=1; i++) {
//			System.out.print("*");
		}
		for(int i=1; i<=2; i++) {
//			System.out.println("*");
		}
		for(int i=1; i<=3; i++) {
//			System.out.println("*");
		}
		for(int i=1; i<=4; i++) {
//			System.out.println("*");
		}
		for(int i=1; i<=5; i++) {
//			System.out.println("*");
		}
		
		for(int j=1; j<=20; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
