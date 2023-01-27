package for문;

import java.util.Scanner;

public class Ex06구구단입력 {

	public static void main(String[] args) {
		
		// 0.Scanner 추가
		Scanner sc = new Scanner(System.in);
		// 1.사용자로부터 자연수 입력
		// "자연수를 입력하세요 : "
		System.out.print("자연수를 입력하세요 : ");
		// 2. 입력받은 정수를 num에 저장!
		int num = sc.nextInt();
		// 3. 입력받은 정수를 활용하여 구구단 시작 출력문
		System.out.printf("------%d단-----%n", num);
		// 4. for문을 이용하여 입력받은 정수의 단을 시작.
		for(int i =1; i<=9; i++)
		{
			int result = num * i;
			System.out.printf("%d x %d = %d%n", num, i, result);
		}
		sc.close();
	}

}
