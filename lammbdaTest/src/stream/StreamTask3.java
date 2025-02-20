package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
		System.out.println("1번 =====================================");
//      1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 10).forEach(n -> {numbers1.add(n);});
		numbers1.forEach(num -> {System.out.println(num);});
//					// 값 받아서 -> 뭐 할건지
		
		
		System.out.println("2번 =====================================");
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> isOdd = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10)
		.filter(n-> n % 2 == 1)
		.forEach(num -> System.out.println(num));
		
		
		
		System.out.println();
		System.out.println("3번 =====================================");
//      3) 1~10까지 ArrayList에 짝수만 담고 출력하기
		ArrayList<Integer> isEven = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10)
		.filter(n-> n % 2==0)
		.forEach(num -> System.out.println(num));
		
		
		System.out.println();
		System.out.println("4번 =====================================");
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Character> array = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z')	
//		.forEach(System.out::println);
		.forEach((i)->array.add((char)i));
		System.out.println(array);
		
		
		System.out.println();
		System.out.println("4-1번 =====================================");
//		4-1) a~z까지 A~Z로 변경해서 출력하기
		 ArrayList<Character> upperArray = new ArrayList<Character>();
	     array.forEach(c -> upperArray.add((char) (c - 32)));
	     System.out.println(upperArray);
		
		
		
		System.out.println();
	    System.out.println("5번 =====================================");
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
		 ArrayList<Character> printEvenAlphabet = new ArrayList<Character>();
		 IntStream.rangeClosed('a', 'z')
	     .filter(i -> (i - 1) % 2 == 0) 
	     .forEach(i -> printEvenAlphabet.add((char) i));
	      System.out.println(printEvenAlphabet);
		
		
			System.out.println();
	      System.out.println("6번 =====================================");
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
//		ArrayList<Integer print>
	    ArrayList<Integer> addArrList = new ArrayList<Integer>();
	    IntStream.rangeClosed(1, 30)
	    .filter((i)-> 10<=i && 20>=i)
	    .forEach(System.out::println);
	      
	    
		System.out.println();
	    System.out.println("7번 =====================================");
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기      
		ArrayList<Integer> addEven = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10)
		.filter(n -> n % 2 == 0)
//		.reduce(0, (a,b)->a + b);
		.forEach(n -> addEven.add(n));
//		Optional<Integer> result = addEven.stream().reduce((a,b)->a + b); 
		int result = addEven.stream().reduce(0,(a,b)->a + b); 
		System.out.println( result );
		
		
		System.out.println();
		System.out.println("8번 =====================================");
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기	
		    // 문자열 리스트
		 ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "java", "apple", "test"));
	        words.stream()
	        .filter(word -> word.contains("a"))
	        .forEach(System.out::println);

		
			System.out.println();
	        System.out.println("9번 =====================================");
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
	        ArrayList<Integer> printNums = new ArrayList<Integer>();
	        IntStream.rangeClosed(1, 10)
	        .forEach((d)-> printNums.add(d));
	        int resultD = printNums.stream().reduce(0,(a,b)->a+b);
	        System.out.println( + resultD);
	
	        
			System.out.println();
	        System.out.println("10번 =====================================");
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		Optional<Integer> data = task.stream().reduce((a,b)->a + b); // 리듀스
		int data = task.stream().reduce(0,(a,b)->a + b); // 리듀스
		System.out.println(data);
		
		
		
		System.out.println();
		System.out.println("2) =====================================");
//	      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//	      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//	      필드 : 이름, 취미, 소개
//	      홍길동, 축구_농구_야구, 나는 축구왕!
//	      이순신, 개발_당구_축구, 나는 개발자 좋아!
//	      장보고, 피아노, 피아노만 한 우물!
//	      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//	      김영희, 골프_야구, 운동 선수는 나의 꿈
//	      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구,", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
						
		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1,member2,member3,member4, member5,member6));
		
//		members.stream()
//			.map((member) -> member.getHobby())
//			.map((hobby)->hobby.contains("개발"))
//			.forEach(System.out::println);
		 members.stream()
         .filter(member -> member.getHobby().contains("개발"))
         .forEach(System.out::println);      
						
	}

}
