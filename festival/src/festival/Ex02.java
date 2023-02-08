package festival;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
	}

	public static String getMiddle(String a) {
		int num = a.length();
		String result = null;
		if (num % 2 == 1) {
			result = a.substring(num / 2, num / 2 + 1);
		} else {
			result = a.substring(num / 2 - 1, num / 2 + 1);
		}
		return result;
	}

}
