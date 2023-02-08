package test;

public class Question3 {

	public static void main(String[] args) {

		MobilePhone m = new MobilePhone();
		CameraPhone c = new CameraPhone();
		SmartPhone s = new SmartPhone();
//---------------------------MobilePhone 확인---------------------//
		m.call();
		m.message();
//---------------------------CameraPhone 확인-------------------------//		
		c.call();
		c.message();
		c.picture();
		c.music();
//---------------------------smartPhone 확인---------------------------//	
		s.call();
		s.message();
		s.picture();
		s.music();
		s.kakaoTalk();
		s.wifi();
	
		
	}

}
