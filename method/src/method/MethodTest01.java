package method;

public class MethodTest01 {
	
//	메서드는 클래스 없이 사용할 수 없다.
	
//	1. 두 수를 더해서 더한 값을 알려주는 메서드 
	int add(int num1, int num2){
		return num1 + num2; // 리턴값 , 리턴 타입(리턴되는 값의 타임)
	}

//	2. 이름을 받으면 이름을 콘솔에 출력해주는 메서드
	void printName(String name) {
		System.out.println(name);// 값이 없을 때는 void
	}
//	================================
//	두 개의 정수를 뺀 결과를 알려주는 메서드
	int subtract(int num1, int num2){
		return num1 - num2;
	}
	// 우리가 만든 subtract메서드는 클래스가 가지고 있는 메서드이기때문에 클래스를 가져온다.
	public static void main(String[] args) {
//		클래스명 변수명 = new 클래스명();
		MethodTest01 mt = new MethodTest01();
		int result = 0;
		result = mt.subtract(0,0); 
	}
	
}
