
package operatorTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
//		(마스터)
//		사용자에게 값을 입력받고
//		정수라면 정수입니다.
//		실수라면 실수입니다.
//		예) 183 -> 입력한 값은 정수입니다.
//		183.5 -> 입력한 값은 실수입니다.
//		삼항 연산자를 사용하기
		
		Scanner sc = new Scanner(System.in);
		double num1 = 0.0;
		int num2 = 0;
		String message = "정수 또는 실수 값을 입력하세요.", result = "",
				exampleMessage = "ex)10 or 10.5";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		num1 = Double.parseDouble(sc.next());
		num2 = (int)num1;
		
		result = num1 == num2 ? "입력한 값은 정수입니다." : "입력한 값은 실수입니다.";
//		result = num1 - num2 == 0 ? "입력한 값은 정수입니다." : "입력한 값은 실수입니다.";
//		result = num1 % 1 == 0 ? "입력한 값은 정수입니다." : "입력한 값은 실수입니다.";
		
		System.out.println(result);
		
		
		}
}
