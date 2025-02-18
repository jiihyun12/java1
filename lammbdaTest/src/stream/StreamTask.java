package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask {
	public static void main(String[] args) {
		
//		1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);
		
//		ABCDEF를 각 문자별로 출력하기
		String data1 = "ABCDEF";
//		data1.chars().forEach(System.out::println);
		data1.chars().map((c)-> c).forEach(c -> {System.out.println((char)c);}); 
		
//		1~100까지 홀수만 ArrayList에 담고 출력하기
		
		
//		A~F중 D를 제외하고 ArratList에 담고 출력하기
		
		
		
		
	}
}
