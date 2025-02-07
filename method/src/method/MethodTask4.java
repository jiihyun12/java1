package method;

import java.util.Scanner;

public class MethodTask4 {
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//	void countChar(String char1, char c){
//		String input = "";
//		int result = 0;
//		for(int i = 0; i < char1.length(); i++) {
//			if(char1.charAt(i) == c) {
//				result++;
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		String input = "";
//		int count = 0;
//		
//		System.out.println("문자를 입력하시면, 원하는 문자의 개수를 구해드립니다. \n ex) 입력: apple, a  결과: a는 2개입니다.");
//		String inputWord = sc.nextLine();
//	}
		
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	
	
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//	String hangle = "공일이삼사오육칠팔구";
//	int[] number = new int[10];
//	한글의 인덱스값과 정수의 방 번호가 같으면 출력
	
	
int[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
char[] hangles = {'공','일','이','삼','사','오','육','칠','팔','구'};
String input = "";
String result = "";
Scanner sc = new Scanner(System.in);
String message = "정수를 입력하세요 ex) 1234";

System.out.println(message);
input = sc.nextLine();
	
for(int i = 0; i <= input.length(); i++) {
		for(int j = 0; j < 10; j++) {
			if(input.charAt(i) == numbers[j]) {
				System.out.print(hangles[j]);	

			}		
		}
	}
	
	
	
// 과제
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	
	
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//매개 변수 2개: 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
	
	
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	
}

