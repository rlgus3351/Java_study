package javaproject;

import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한후 가장 큰수와 작은 수를 각각 출력하시오.
		// 0.랜덤 가져오기
		Random r = new Random();
		// 1.8칸 크기의 정수형 배열 선언하기.
		int[] array = new int[8];
		// 2.랜덤수 배열에 집어넣기
		for (int i = 0; i < array.length; i++) {//인덱스 0번부터 array.length-1까지 집어넣기 위한 반복문
			array[i] = r.nextInt(100) + 1; //예시로 1~100까지 자연수를 넣기 위해서 
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {//배열에 들어있는 값 출력
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// 3. 가장 큰수와 가장 작은 수 출력하기
		int max = array[0]; //인덱스 0번을 가장 큰 값을 저장하기위한 변수 max에 넣어준다.
		int min = array[0]; //인덱스 0번을 가장 작은 값을 저장하기위한 변수 min에 넣어준다.
		for (int i = 1; i < array.length; i++) { //초기값이 1인 이유는 max,min에 0번의 인덱스를 넣어줬으니 0번과 0번을 비교할 필요가 없어 1번 인덱스부터 진행.
			if (max < array[i]) {//인덱스i의 값이 max보다 클 때 max에 값을 넣어준다.
				max = array[i];
			}
			if (min > array[i]) {//인덱스i의 값이 min보다 작을 때 min에 값을 넣어준다.
				min = array[i];
			}
		}
		//min, max 출력
		System.out.println("가장 큰 값 : "  + max);
		System.out.println("가장 작은 값 : "  + min);
	}

}
