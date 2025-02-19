package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import javax.management.RuntimeErrorException;

public class OptionalTest {
	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("함지현", "hjh", "1234"),
			new User2("김영수", "kys", "4567"),
			new User2("양진영", "yjy", "8912"),
			new User2("신정훈", "sjh", "3456")
			));
	
	// NPE로직
//	public User2 findById(Long id) {
		public Optional<User2> findById(Long id) {
		User2 user = null;
		for(User2 userInDB :users) {
			if(userInDB.getId() == id) {
				user = userInDB;
			}			
		}
//		return user;
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest();
		Long num1 = 3L; // 클래스형 자료형이라 L을 붙여줘야함
//		long num2 - 3; // 기본 자료형
		
//		User2 user = ot.findById(200L); // 컴파일 에러는 없으나 NPE가 터진다.
		Optional<User2> user = ot.findById(200L);
		
//		null이 아니라면 user, null이라면 대체 user
		user.orElse(new User2());
		
//		null이 아니라면 user, null 라면 ()->{예외발생};
zs		user.orElseThrow(()-> {
			throw new RuntimeErrorException("그런 회원 없습니다.");
		});
										
		System.out.println(user.toString());
		
//		있을 때만 접근
		user.ifPresent((findUser)->{
//			user가 있을 때만 아래 로직을 실행
//			null이 아닐 때만 실행하는 로직
			System.out.println("ifPresent");
			System.out.println(findUser.toString());
		});
		
		user.ifPresentOrElse((findUser)->{
			null이 아니면 실행
		}, ()->{
			null일 때 실행하는 로직
			system.out.println("존재하지 않는 회원")
		}
		})
		
		
	}
}


