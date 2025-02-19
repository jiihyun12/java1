package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import stream.User;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 값은 1씩 증가
		IntStream.range(0, 10); // 0~9까지
		
//		IntStream.range(0, 10).forEach((num)->{System.out.println(num);});
		IntStream.range(0, 10).forEach(System.out::println); // 참조형
		
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		IntStream.rangeClosed(1, 10).forEach((num) -> datas.add(num));
		IntStream.rangeClosed(1, 10).forEach(datas::add); // 참조형
		
//		참조형
//		소속::메서드
//		datas.forEach(System.out::println);
	
//		실습
//		10~1까지 ArrayList를 만들고, 만든 ArrayList에 값을 담고(add), 모두 출력하기
		
		ArrayList<Integer> arrNums = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
		IntStream.rangeClosed(10,1).forEach(arrNums::add);
//		arrNums.forEach(System.out::println);
		
		
		
		
//		인덱스 0부터 4까지 삭제
		ArrayList<Integer> arrNums2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
		IntStream.range(0, 5).forEach(num -> arrNums2.remove(0));
//		arrNums2.forEach(System.out::println);
//		System.out.println(arrNums2);
		
		
//		문자열 stream
//		chars() : 문자열을 Intstream으로 변환 
		String data3 = "ABCDEF";
		String data4 = "ㄱㄴㄷㄹ";
//		data3.chars().forEach(System.out::println);
//		data4.chars().forEach(System.out::println); 
		
//		data4.chars().forEach((c)->{System.out.println((char)c);}); // 다시 문자로 변환 
		
//		.map() 
//		data4.chars().map((c)-> c + 4).forEach(c -> {System.out.println((char)c);}); 
												// 값을 원활하게 출력하고 싶다면 형변환을 마지막에 할 것!
		
		User user1 = new User(1, "함지현", 17, "학생");
		User user2 = new User(2, "이순신", 20, "개발자");
		User user3 = new User(3, "홍길동", 50, "요리사");
		User user4 = new User(4, "장보고", 40, "디자이너");
		User user5 = new User(5, "이성계", 137, "사장");
		
//		직업만 출력
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
//		users.forEach(System.out::println);
//		users.stream().map((user)-> user.getJob()).map((job)-> "직업 : " + job)forEach(null));
		
//		유저의 나이만 출력하기, 참조형X
//		users.stream().map((user) -> user.getAge()).forEach(age)->{
//			System.out.println(age))
//		};
		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로 앞에 "/app"을 붙인다.
		
		
		String path1 = new String("/news");
		String path2 = new String("/game");
		String path3 = new String("/brand");
		
		ArrayList<String> path = new ArrayList<String>();
		path.add(path1);
		path.add(path2);
		path.add(path3);
//		path.stream().map((path)-> "/app" + path).forEach(System.out::println);
//		System.out.println(path);
		
		
//		정렬 : sorted()
		ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList())
		
//		내림차순
			numbers.stream().sorted(Colletions.reverseOrder())
//			결과값의 리턴을 다양한 타입으로 : collector~
//			ArrayList<E>
			
//		문자열로 c
//			ArrayList<Integer>number4 = new ArrayList<Integer>(Arrays.asList())
//			number3.Stream
			
//			filter()
			ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
			ArrayList<Integer> even = new ArrayList<Integer>();
			numbers.stream().filter((n)->n%2 ==0).forEach(even::add);
			even.forEach(System.out::println);
			
			 StringBuilder result = new StringBuilder();
		        for (char ch : korean.toCharArray()) {
		            if (numMap.containsKey(ch)) {
		                result.append(numMap.get(ch));
		            }
		        }
		        return Integer.parseInt(result.toString());
		
	}
}
