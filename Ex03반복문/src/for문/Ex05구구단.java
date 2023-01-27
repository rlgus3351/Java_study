package for문;

public class Ex05구구단 {

	public static void main(String[] args) {
		int num = 2;
		
		System.out.printf("-----%d단-----%n",num);
		for(int i =1; i<=9; i++) {
			int result = num * i;
			System.out.printf("%d X %d = %d%n", num, i, result);
		}

	}

}
