package while문;

public class Ex01 {

	public static void main(String[] args) {
		//while문을 사용해서 안녕하세요 5번 출력하기.
		// 1. 반복시킬 부분 찾기.
		int num = 1;
//		while(num <= 5){
//			System.out.println("안녕하세요.");
//			num++;
//			}	
		// 무한 반복문 
		// while문이 무한으로 돌아갈때 멈추는 키워는 : break;이다
		while(true){
			System.out.println("안녕하세요.");
			
			if(num==5){
				break;
			}
			num++;

		}	
		
	}
}
