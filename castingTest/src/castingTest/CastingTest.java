package castingTest;

class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	} 
}

class SuperCar extends Car{ // Car 상속 받음
	public SuperCar() {;}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");  
		     // engineStart() 메서드를 오버라이딩해서 "음성으로 시동 킴"으로 변경
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!"); // 메서드 추가
	}
	
}


public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar(); // 부모 타입으로 자식 객체 저장
		noOptionFerrari.engineStart();
//		 결과: "음성으로 시동 킴" --> 자식의 값이 나옴	
//		부모 타입(Car) 변수 noOptionFerrari에 SuperCar 객체를 저장
//		오버라이딩된 메서드(engineStart())는 자식 클래스의 것이 실행됨
//		openRoof()는 호출 불가능 (부모 클래스에 없는 기능이므로)

		
		
//		오류
//		업캐스팅된 객체만 다운캐스팅 가능!
//		SuperCar ferrari2 = new Car();

		
		
//		자식은 부모 타입이고 부모는 자식 타입이 아니다.
//		down casting 
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
//		noOptionFerrari는 원래 SuperCar 객체였으므로 다시 SuperCar 타입으로 캐스팅 가능
//		이제 openRoof()도 호출할 수 있으므로 "뚜껑 오픈!" 출력된다.
		
		
//		객체 instanceof 타입 : 참 또는 거짓
//		instanceof는 객체가 특정 클래스의 인스턴스인지 확인하는 연산자이다.
//		업캐스팅된 객체의 실제 타입을 확인 하기 위해 사용한다.
		System.out.println(matiz instanceof Car); // true (matiz는 Car 객체) -- matiz변수의 타입은 Car
		System.out.println(matiz instanceof SuperCar); // false (matiz는 SuperCar 객체가 아님)
		System.out.println(ferrari instanceof Car); // true (상속 관계이므로 SuperCar도 Car로 인식)
		System.out.println(ferrari instanceof SuperCar); // true (SuperCar 객체이므로)
		System.out.println(noOptionFerrari instanceof Car); // true
							// noOptionFerrari 변수의 타입은 Car, 실제 저장된 객체는 new SuperCar()
							// SuperCar는 Car를 상속받았기 때문에 noOptionFerrari는 Car의 인스턴스도 맞다.
							// noOptionFerrari는 실제로 SuperCar 객체를 가리키고 있다.
		System.out.println(noOptionFerrari instanceof SuperCar);// true
		System.out.println(fullOptionFerrari instanceof Car); // true
		System.out.println(fullOptionFerrari instanceof SuperCar); // true
	
		
	}
}





