package variableTest;

public class Variable {
	public static void main(String[] args) {
		int a = 10; // 정수 4byte
		long b = 20; // 정수 8byte
		
		float c = 3.14F; // 실수 4byte
		double d = 10;  // 실수 4byte
		
		boolean e = true; // 논리 1byte
		char f = '김'; // 문자형 2byte
		String g = "함지현"; // 문자열 ?
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		int data = 20;
		data = 30; // 자료형을 붙일 필요가 없다.
		
		System.out.println(data + 10); 
//		data - 9;
		
	}
}
