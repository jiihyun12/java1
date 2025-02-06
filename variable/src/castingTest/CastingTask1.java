package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
//		8.43 + 2.59를 더해서 10이 나오도록 출력하기
//		단, 변수에 값을 담아서 활용하기
		
		double num1 = 8.43, num2 = 2.59; // 같은 자료형을 사용하고있다면 한 번만 선언하고 콤마를 사용할 수 있다.
		int result = (int)num1 + (int)num2;
		
		System.out.println(result);
	}
}
