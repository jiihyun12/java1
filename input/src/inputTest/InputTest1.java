package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요", name = null, lastName=null,firstName = null;
		
		System.out.println(message);
//		String name = sc.next(); // 메서드의 리턴 타입이 string이기때문에 
//		lastName = sc.next();
//		firstName = sc.next();
		name = sc.nextLine();  // 띄어쓰기까지 출력
//		name = lastName + firstName;

		System.out.println(name + "님 환영합니다.");
		
		
	}
}
