package 메소드;

public class Ex03약수확인하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

	}

	private static boolean isDivisor(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
