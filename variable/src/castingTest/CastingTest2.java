package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		// 아스키 코드
		// 65 대문자A ~ 90 대문자Z
		// 97 소문자a ~ z
		
//		강제 형변환(문자형)
		System.out.println('A' + 10); // 75
		System.out.println('A' * '?'); // 4095 
		System.out.println('A' == 65); // true
		System.out.println((char)66); // B
	}
}
