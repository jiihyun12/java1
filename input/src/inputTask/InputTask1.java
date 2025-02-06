package inputTask;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//	두 정수를 입력한 뒤 덧셈 결과를 출력한다.
//	단, sc.next()만 사용한다.
//  실습 10분
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		String message = "두 정수를 입력하세요. ex)10 20", resultMessage = "%d + %d = %d\n";
		
		System.out.println(message);
		
		number1 = Integer.parseInt(sc.next());
		number2 = Integer.parseInt(sc.next());
		result = number1 + number2;
		
		System.out.printf(resultMessage, number1, number2, result);
		
		
	}
}
