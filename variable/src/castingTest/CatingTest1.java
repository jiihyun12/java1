package castingTest;

public class CatingTest1 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(1 + 2); // 정수 + 정수 = 정수
		System.out.println(1 + 2.5); // 정수 + 실수 = 실수
		
//		강제 형변환
		System.out.println(5 / 2); // 정수 / 정수 = 정수
		System.out.println(5 / (double)2); // 정수 / 실수 = 실수
										// 2를 강제 형변환 시켜 실수로 변환 후 정수랑 나눈다.
	}
}
