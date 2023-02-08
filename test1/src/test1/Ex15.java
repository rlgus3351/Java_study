package test1;

import java.util.Iterator;

public class Ex15 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] text = score.split(",");
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals("A")) {
				a++;
			} else if (text[i].equals("B")) {
				b++;
			} else if (text[i].equals("C")) {
				c++;
			} else if (text[i].equals("D")) {
				d++;
			} else {
				f++;
			}

		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
	}

}
