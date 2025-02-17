//package casting;
////
//public class CastingTest {
//	
//	public void allType(모자 모자쓴애) {
////		instanceof
//	}
//	
//	
//	
////	자식은 부모타입이다. == 자식은 타입이 두 개 (나 + 부모)
////	부모는 자식을 품을 수 있다.
//	
	    // 부모 클래스 (상속될 클래스)
//	    String name;
//	    String age;

	    // 부모 클래스의 메서드
//	    public void printInfo() {
//	        System.out.println("부모 A 출력");
//	    }
//
//	    // instanceof 연산자를 사용할 메서드 (업캐스팅 & 다운캐스팅)
//	    public void allType(CastingTest obj) { //CastingTest 타입 사용
//	        if (obj instanceof B) { // obj가 B 타입이면 true
//	            B child = (B) obj; // 다운캐스팅 - 부모 타입의 객체를 다시 자식 타입으로
//	            child.printInfo(); // 자식 B의 메서드 호출 가능
//	        } else {
//	            System.out.println("B 타입이 아닙니다.");
//	        }
//	    }
//	};

	// 부모 클래스 CastingTest를 정의, printInfo() 메서드를 구현
	// allType() 메서드는 instanceof를 사용해서 타입을 검사하고 다운캐스팅한다.
	// 업캐스팅 - 자식 객체를 부모 타입으로
	// 다운캐스팅 - 부모 타입의 객체를 다시 자식 타입으로
