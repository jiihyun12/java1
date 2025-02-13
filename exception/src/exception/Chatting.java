package exception;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보내는 메시지");
		message = sc.nextLine();
		System.out.println();
		
		System.out.println(message);
		if(message.contains("바보")){
			throw new BadWordExeption("비속어 금지");
		}
	}
}
