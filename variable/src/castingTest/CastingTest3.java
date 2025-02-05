package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
//		자동 형변환
//		정수 -> 문자열
		System.out.println("1" + 10);
		System.out.println("1" + 3 + 8); // 138
		System.out.println("1" + (3 + 8)); // 111
		
//		System.out.println((int)"1" + 100); // int는 기본 자료형이고 String은 클래스자료형이다.따라서 불가
		System.out.println(Integer.parseInt("1") + 100); // 클래스 먼저 호출하고 int로 변환
		System.out.println(Double.parseDouble("3.9") + 20); // 23.9
		System.out.println(Boolean.parseBoolean("true")); // true (불린타입)
	}
}
