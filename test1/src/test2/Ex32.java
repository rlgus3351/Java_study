package test2;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점 하기 ====");
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		String answer = sc.next();
		String[] text = answer.split("");
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals("o")) {
				cnt++;
				sum += cnt;
			} else {
				cnt = 0;
				sum += cnt;
			}
		}
		System.out.println(sum);
	}

}
