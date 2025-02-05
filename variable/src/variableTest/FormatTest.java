package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "함지현";
		int age = 20;
		double height = 166.7;
		
		System.out.printf("이름 : %s \n", name );
		System.out.printf("나이 : %d \n", age);
		System.out.printf("키 : %.1fcm", height); // 자리수를 표현해주면 원하는 소숫점 자리만큼 출력된다.
	}
}
