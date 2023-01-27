package Ex01자동차;

public class Car {

	// 필드 - 데이터를 저장하는 공간 (변수)
	int doorCnt; // 문의 개수
	int wheelCnt; // 바퀴 개수
	boolean isTrunk; // 트렁크 유무
	int sideMirrorCnt; // 사이드미러 개수
	String handleShape; // 핸들 모양

	// 메소드 - 객체가 할 행위
	// 1. 시동걸기
	public void startUp() {
		System.out.println("부와아앙");
	}

	// 2. 달리다
	public void run() {
		System.out.println("우우웅~ 부우웅~");
	}

	// 3. 브레이크를 건다
	public void brake() {
		System.out.println("끼이이이익");
	}

	// 4.기어변환
	public void gearChange() {
		System.out.println("기어를 변환합니다.");
	}

	// 5.자동주차
	public void automaticParking() {
		System.out.println("자동주차 중 ~~");
	}

}
