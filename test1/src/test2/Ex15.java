package test2;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String a) {
		int num = a.length();
		String result = null;
		if (num % 2 == 1) {
			result = a.substring(num / 2 + 1, num / 2 + 2);
		} else {
			result = a.substring(num / 2 - 1, num / 2 + 1);
		}
		return result;
	}

}
