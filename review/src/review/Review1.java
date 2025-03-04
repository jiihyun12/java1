
// 복습 및 예제

package review;

import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		int inputNum = 0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. 입력하신 숫자만큼 출력됩니다.");
		inputNum = sc.nextInt();
		while(i <= inputNum){
			System.out.println(i);
			i++;
		}
	}
		
	}



