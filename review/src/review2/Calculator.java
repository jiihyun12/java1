package review2;

public class Calculator {
		
		public void divide(int a, int b) {
			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
			}
			
		}
		
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			
			calc.divide(10, 0);
//			calc.divide(10, 5);
	}
}
