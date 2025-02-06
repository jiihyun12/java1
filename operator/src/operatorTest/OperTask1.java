
package operatorTest;

import java.util.Scanner;

public class OperTask1 {
		public static void main(String[] args) {
//		(마스터)
//		사용자에게 값을 입력 받고 
//			정수라면 정수입니다. 
//			실수라면 실수입니다.
//		예) 183 -> 입력한 값을 정수입니다.
//		183.5 ->  입력한 값은 실수입니다.
//		삼항 연산자를 사용하기
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String message = "숫자를 입력하세요", result = null;
		
		System.out.println(message);
		
		num = (int)Double.parseDouble(sc.next());
	
		result = num % 1 == 0 ? "정수입니다." : "실수입니다.";
			
		System.out.println("입력하신 숫자는 \n" +  result );
		
	
}
}
