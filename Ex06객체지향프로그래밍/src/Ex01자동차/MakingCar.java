package Ex01자동차;

public class MakingCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 우리가 설계한 Car Class에서 Car 객체 만들기
		Car myCar = new Car();

		// 객제의 필드에 접근하기
		myCar.doorCnt = 4;
		myCar.wheelCnt = 4;
		myCar.isTrunk = true;
		myCar.sideMirrorCnt = 2;
		myCar.handleShape = "둥근모양";

		// 객체의 필드값 출력
		System.out.println(myCar.doorCnt);
		System.out.println(myCar.wheelCnt);
		System.out.println(myCar.isTrunk);
		System.out.println(myCar.sideMirrorCnt);
		System.out.println(myCar.handleShape);

		// 객체의 메소드 실행
		myCar.startUp();
		myCar.run();
		myCar.brake();
		myCar.gearChange();
		myCar.automaticParking();

	}

}
