package test1;

public class Ex14 {
	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String a) {
		if (a.length() % 2 == 1) {
			String text = a.substring(a.length() % 2 + 1, a.length() % 2 + 2);
			return text;
		} else {
			String text = a.substring(a.length() % 2 + 1, a.length() % 2 + 3);
			return text;
		}
	}

}
