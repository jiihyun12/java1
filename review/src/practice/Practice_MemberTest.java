package practice;

import java.util.Objects;

// 250406


// 이 파일의 시작점이자 실행 클래스
public class Practice_MemberTest {
	
	public static void main(String[] args) {
		
		// Member라는 설계도(클래스)로 객체를 생성(new = 새로 만든다)
		Member member1 = new Member("장재관절염", 28, "abc123@gmail.com");
		Member member2 = new Member("양진전자담배", 32, "def456@gmail.com");
		Member member3 = new Member("제이슨오늘파티잊지마", 34, "ghi789@gmail.com");
		
		Member[] members = {member1, member2, member3};
		
		for(int i = 0; i < members.length; i++) {
			String result = members[i].introduce();
			System.out.println(result);
		}
	}
}

// 사용자 정의 클래스 : 회원이라는 개념을 코드로 표현
class Member {
	// 필드(멤버 변수) -> 각 회원이 가지고 있는 고유한 정보
	String userName;
	int userAge;
	String userEmail;
	
	// 기본 생성자 -  아무 값 없이 생성할 수도 있는 객체를 만들기 위함
	public Member() {;}

	// 생성자 - 객체를 생성할 때 자동으로 실행됨
	// 외부에서 이름과 나이를 전달 받아 필드에 저장
	public Member(String userName, int userAge, String userEmail) {
		
		// this 필드 = 전달 받은 값
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
	}

	// 객체를 출력할 때 자동으로 호출되는 메서드
	public String introduce() {
		
		String msg1 = "안녕하세요, 제 이름은 " + userName + "이고, 나이는" + userAge + "입니다. \n";
		String msg2 = "";
		
		if(userAge >= 30) {
			msg2 = "할아버지 안녕하세요!";
		}else {
			msg2 = "응애!";
		}
		return msg1 + msg2;
		
	}	
	
}
