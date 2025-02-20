//package stream;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class StreamTask2 {
//	
//	public static void main(String[] args) {
		
//  1) 5개의 문자열을 모두 소문자로 변경하기
//  "Black", "WHITE", "reD", "yeLLow", "PINk"
//	String data11 = "Black";
//	String data12 = "WHITE";
//	String data13 = "reD";
//	String data14 = "yeLLow";
//	String data15 = "PINk";
//	ArrayList<String> arr1 = new ArrayList<String>(
//			Arrays.asList(data11,data12,data13,data14,data15)
//			);
	
//	arr1.stream().map(String::toLowerCase).forEach(System.out::println)
	
//  2) Apple, banana, Melon, cherry, "딸기"
//  단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
	
//	ArrayList<String> arr2 = new ArrayList<String>();
//	arr2.add("Apple");
//	arr2.add("banana");
//	arr2.add("Melon");
//	arr2.add("cherry");
//	arr2.add("딸기");
//	
	// A-Z  &&  a-z 
//	
//	arr2.stream()
//	.filter(str->str.charAt(0) >= 'A')
//	.filter(str->str.charAt(0) <= 'Z')
//	.forEach(System.out::println);
//	
//	
	
//  3) 한글을 정수로 변경
//  "일공이사" -> 1024

//	String hangle = "공일이삼사오육칠팔구";
//	String data = "일공이사";
//	data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::println);
//	
//	

  
//  4) 정수를 한글로 변경
//  "1024" -> "일공이사"
//	ArrayList<Integer>numbers = new ArrayList<Integer>();
		// 공통점이 없으면 공통점을 만든다.
		//--> "공일이삼사오육칠팔구

//	String hangle2 = "공일이삼사오육칠팔구";
//	String data2 = "1024";
//	data2.chars().map(c -> String.valueOf(hangle.charAt(c - '0'));
//	.collect(Collectors.joining());
//	};
//	


//};
