package Animal;

// 내가 가지고 있는 method중 하나라도 추상화된 method가 있다면
// 클래스는 추상화된 클래스여야 한다.
public abstract class 포유류 {
	// abstract class는 new를 통한 객체를 만들수 없다.
	// 포유류 포유류1 = new 포유류();

	protected void 먹다() {
		System.out.println("먹다.");
	}

	// 추상화된 메소드는 Body가 없다.
	protected abstract void 울다();

	protected void 자다() {
		System.out.println("자다.");
	}

}
