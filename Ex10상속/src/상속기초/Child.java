package 상속기초;

public class Child extends Parents {

	// 새로운 클래스, 자식클래스, 서브클래스
	// 식당 2호점

	public void makeKal() {
		System.out.println("칼국수를 만들자~ 휘리릭~");
	}

	// 메소드 오버라이딩(method overriding)
	// : 부모 클래스가 가지고 있던 메소드 틀(리턴타입, 메소드명, 매개변수)을
	//   그대로 가지고 와서 안쪽에 있는 로직({} 안)만 재정의하는 기법
	// 	 상속이 전제되어 있어야 한다.

	public void makeKimchi() {
		System.out.println("맛있는 삼겹살 김치전을 만들자~ 바사삭~");
	}

}
