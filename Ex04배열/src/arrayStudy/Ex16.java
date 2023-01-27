package arrayStudy;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제. 배열의 인덱스의 수 만큼 별을 출력해보세요.
		
		//1. 정수형 별 카운트 개수를 입력해준다.
		int[] startcount = {3,4,4,2,1};
		//2. for문을 이용하여 별을 출력해준다.
		for (int i = 0; i < startcount.length; i++) {
			System.out.print(startcount[i]+ " : ");
			for(int j =0; j<startcount[i]; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}

	}

}
