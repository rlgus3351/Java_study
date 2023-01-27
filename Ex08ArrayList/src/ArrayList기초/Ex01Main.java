package ArrayList기초;

import java.util.ArrayList;
import java.util.List;

public class Ex01Main {

	public static void main(String[] args) {

		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진 클래스

		// Collection :
		// 특정 자료 구조를 클래스화 시킨 것
		// ex) ArrayList, HashMap 등

		// 1. ArrayList 생성
		// 레퍼런스 타입의 데이터만 저장할 수 있다.
		// Pokemon, Student, Member, String .....

		// ArrayList<레퍼런스 타입> 이름=
		ArrayList<String> list = new ArrayList<String>();

		// <>
		// : 제네릭(generic)기법
		// 객체를 생성하는 순간 어떠한 자료형을 넣을지 모를 때 넣을 수 있게 해준다.

		// 2. 데이터 추가하기
		list.add("닭도리탕");
		list.add("허니콤보");
		list.add("떡볶이");

		// 3. 데이터 특정 위치에 추가하기
		list.add(0, "소곱창");

		// 4. 데이터 가져오기
		System.out.println(list.get(1));

		// 5. 데이터 삭제
		list.remove(2);
		System.out.println(list.get(2));

		// 6. 배열의 길이
		System.out.println(list.size());

		// 7. 데이터 전체 삭제
		list.clear();
		System.out.println(list.size());

	}

}
