package 일차원배열;

public class Ex05배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,1,8,72,31,100,105}; //int형 array명 배열에 임의의 값 지정
		int max = 0; //가장 큰 값으로 사용할 변수 지정
		for(int i=0; i<array.length; i++) { //0번째 부터 배열의 길이만큼 조건문을 지정
			if(array[i]>max)	//배열값이 high_Number보다 크면 이라는 조건문을 생성후
			{
				max = array[i];	//high_Number보다 큰 array[i]의 값을 대입해준다.
			}
		}
		System.out.println("가장 큰 값은 " + max + "입니다.");
	}
}

