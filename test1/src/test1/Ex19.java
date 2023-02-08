package test1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1,num2,op));


		
	}
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if(op=='-') {
			result = (num1>num2)? num1-num2:num2-num1;
			return result;
		}else if(op=='+') {
			return num1+num2;
		}else if(op=='*') {
			return num1*num2;
		}else {
			return num1/num2;
		}
	}

}
