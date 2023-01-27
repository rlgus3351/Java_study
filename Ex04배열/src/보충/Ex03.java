package 보충;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] text = score.split(",");
		
		int[] num = new int[6];
		//65 66 67 68 69 70
		//A B C D E F 
		int[] result = new int[text.length]; 
		 
		System.out.println(result);
		
		for(int i=0; i<6; i++) {
			num[i] = i+65;
		}
		
		for(int i=0; i<6; i++) {
			if(text[i].equals((char)num[i])){
				result[i] = i;
			}
		}
		
		

	}

}
