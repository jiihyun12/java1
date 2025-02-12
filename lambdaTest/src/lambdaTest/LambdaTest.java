package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = new LambdaInter() {
//			
//		}
		
//		LambdaInter lambdaInter = (number) -> {return number % 2 == 0;};
		LambdaInter lambdaInter = number -> number % 2 == 0;
		System.out.println(lambdaInter.checkMultipleOf10(20));
		
	}
}

