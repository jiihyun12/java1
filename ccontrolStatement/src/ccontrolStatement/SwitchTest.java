package ccontrolStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		계절 맞추기
//		12 1 2 겨울 0
//		3 4 5  봄 1
//		6 7 8 여름 2
//		9 10 11 가을 3
		
		Scanner sc = new Scanner(System.in);
		String message = "월을 입력하세요 \n 예)10", seasonResult = "";
		int month = 1, season = 0;
		
		System.out.println(message);		
		month = sc.nextInt();
		
		season = month / 3 % 4;
	
		switch(season){
			case 0 :
				seasonResult = month + "월은 겨울입니다.";
				break;
			case 1 :
				seasonResult = month + "월은 봄입니다.";
				break;
			case 2 :
				seasonResult = month + "월은 여름입니다.";
				break;
			case 3 :
				seasonResult = month + "월은 가을입니다.";
				break;
			default: 
				seasonResult = "잘못 된 월입니다.";
				
		}
		
	}
}
