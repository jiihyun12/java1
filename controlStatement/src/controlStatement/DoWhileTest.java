package controlStatement;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
//		while문
//		1부터 20까지의 숫자를 출력하는 for 반복문을 작성하되,
//		짝수일 때는 "짝수입니다.", **홀수일 때는 "홀수입니다."**를 함께 출력하도록 코드를 작성하세요
		
//		int i = 1; // 초기값 설정
//		while (i <= 20) { // i가 20 이하일 때 반복
//		    String result = i % 2 == 0 ? "짝수입니다." : "홀수입니다.";
//		    System.out.println(i + " : " + result);
//		    i++; // 증가하지 않으면 무한 루프 됨! 꼭 증가해 줘야 함
//		}

	
		
//		do-while문	====================================================================
		
		String message = "1.분실신고\n2.통신사 이동\n3.결제수단 변경\n0.상담사 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
	
		
// 1. 
		
//		do { 
//			System.out.println("실행 여부");
//		} while(choice != 0);
		
		// do-while은 최소 한 번 실행되니까 "실행 여부"가 한 번 출력된 후, 
		// choice 값이 0이므로 바로 종료된다.
		
		
// 2.
		
//		 do { 
//	            System.out.println(message);
//	            System.out.print("원하는 번호를 입력하세요: ");
//	            choice = sc.nextInt(); // 사용자 입력 받기
//	        } while(choice != 0); // 0 입력 시 종료
//
//	        System.out.println("상담사 연결 중...");
		
	        //입력한 값이 0이면 반복문 종료 후 "상담사 연결 중..."을 출력한다.
	       // 0이 아니면 계속 메시지를 보여주고 입력을 받는다.
		
	}
}

