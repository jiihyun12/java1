package inputTask;

import java.util.Scanner;

public class InputTask1 {
//	두 정수를 입력한 뒤 덧셈 결과를 출력한다.
//	단, sc.next()만 사용한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = "정수를 두 개 입력하세요", reusltMessage = "%d + %d = %d\n";
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		
		System.out.println(message);
		
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());	
		result = num1 + num2;
		
		System.out.println( "두 정수의 합은" + result +"입니다.");
		
		
		
	}
}
