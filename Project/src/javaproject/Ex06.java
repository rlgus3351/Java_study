package javaproject;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 (77*1)+(76*2)+(75*3)+ ... +(1*77)를 계산하여 결과를 출력하시오.
		
		int sum = 0; //계산값을 저장하기 위한 사전의 초기화
		for(int i=1; i<=77; i++) {//i의 값은 1부터 77까지이며 i의 값을 더하여 반복한다.
			//계산 결과는 (78-1)*(1) + (78-2)*(2) + (78-3)*(3) + ... + (78-77)*(77)이므로
			sum += (78-i)*(i); 
		}
		//결과 출력
		System.out.println(sum);
		
	}

}
