package exception;

import java.util.Scanner;

//  5개의 정수를 입력 받기
//무한 입력 상태로 구현한다
//q를 입력시 나간다
//입력한 각 정수는 배열에 담는다
//if문은 딱 한 번만 사용한다.


public class ExeptionTask {
	public static void main(String[] args) {
		int[] arData = new int[5];
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		String expression = null, message = "정수 5개를 순서대로 입력하세요", exampleMessage="번 째 정수";
		
		
		while(true) {
			try {
				count++;
				System.out.println( count + exampleMessage);
				expression = sc.next();
				
				if(expression.equals("q") || count == 5){
					break;
				}
							
			} catch (Exception e) {
				arData[count - 1] = Integer.parseInt(exampleMessage);
				System.out.println("유효하지 않은 범위니다.");		
				e.printStackTrace();
			}
		}
	}
}



