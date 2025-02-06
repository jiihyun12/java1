package variableTest;

public class Variable {
	public static void main(String[] args) {
		// 정수형 변수 선언 및 초기화
		int a = 10; // 정수 4byte
		long b = 20; // 정수 8byte (더 큰 숫자를 저장할 수 있음)
		
		// 실수형 변수 선언 및 초기화
		float c = 3.14F; // 실수 4byte
		double d = 10;  // 실수 8byte (정수도 저장 가능)
		
		// 논리형 변수 선언 및 초기화
		boolean e = true; // 논리 1byte
		
		// 문자형 및 문자열 변수 선언 및 초기화
		char f = '김'; // 문자형 2byte (한 글자만 저장 가능)
		String g = "함지현"; // 문자열 ? (크기가 가변적)
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		// 변수 재할당 (변수의 값을 변경할 때는 자료형을 다시 선언할 필요 없음)
		int data = 20; // 변수 선언 및 초기화
		data = 30; // 기존 변수에 새로운 값 할당 (자료형 다시 지정 불필요)
		
		System.out.println(data + 10); 
		
//		아래 코드는 연산이 수행되지 않음 (단순히 연산식이 존재할 뿐 출력되지 않음)
//		data - 9;
		
	}
}
