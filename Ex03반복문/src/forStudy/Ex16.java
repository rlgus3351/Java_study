package forStudy;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 16. 다음과 같은 별모양을 만드시요.
		//**********
		// ********
		//  ******	
		//   ****
		//    **
		
		int num = 10; //별의 숫자 출력 개수를 정해주기 위한 변수로 기본 값이 10번부터 2씩 줄어드므로 변수 초기값을 10으로 설정
		for(int i=0; i<5; i++) { //최종 반복회수 5번이므로 1부터 5까지 진행
			for(int j=0; j<i; j++) { //빈칸 개수는 첫번째 0 밑으로 갈수록 한칸 씩 증가된다. i의 값이 즉 줄의 숫자로 시작값을 0 으로 설정하고 조건에 i가 j보다 클때 작동하게 조건문 작성
				System.out.print(" "); // 빈칸 출력
			}
			for(int k=0; k<num; k++) { // 별을 출력하는 구문으로 기존에 설정된 변수num에 대한 숫자만큼 출력
				System.out.print("*"); 
			}
			num -=2;					//별을 출력하면 num의 개수는 -2해준다.
			System.out.println();		//다 끝나면 엔터로 줄바꿈해준다.
		}
	}

}
