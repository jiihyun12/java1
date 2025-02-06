package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {
//      브론즈
//      1~100까지 출력하기
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
//      100~1까지 출력하기
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
//      1~100까지 중 짝수만 출력하기
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
      
//      골드
//      1~10까지의 합을 출력하기
		int result = 0;
		for(int i = 1; i <= 10; i++ ) {
			result += i;
		}
		System.out.println(result);

		
//      1~n까지의 합을 출력하기
//		int result2 = 0;
//		String message = "값을 입력하세요";
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		for(int i = 1; i <= input; i++) {
//			result2 += i;
//		}
//		System.out.println(result2);

		
//      플레티넘
//      A~F까지 출력하기
//      A~F까지 중 C를 제외하고 출력하기
		for(int i = 65; i <= 69; i++) {
			if(i == 67) continue;
			System.out.println((char)i);
		}
      
//      다이아
//      012340123401234 출력하기
		String result3 = "";
		for(int i = 0; i <= 4; i++) {
			result3 += i;
		}
		System.out.println(result3 + result3 + result3);
		
		
//		aBcDeF...Z까지 출력하기
		
// a~z까지 출력하고 인덱스번호가 짝수인 숫자만 대문자로 변경
		for(int i = 97; i <= 122; i++) {
			System.out.printf("%c", i);
		}
//		
		
      
//      마스터
//      별찍기
//       *
//      ***
//     *****
//    *******
//   *********	
		
		
String result4 = "";
	for(int i = 0; i < 10; i+=2){ 
		for(int j = 10; j > i; j -= 2){ 
			result4 += " ";
		}
			 for(int k = 1; k < i; k++){ 
				 result4 += "*";
			 	}
				  	result4 += "\n";
					}

					System.out.println(result4);

		
	}
}
