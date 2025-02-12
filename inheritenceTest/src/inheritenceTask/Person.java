package inheritenceTask;

//Person 클래스
//이름, 나이, 주소, 핸드폰 번호
//work 일을 한다.
//sleep 잠을 잔다.
//eat 세 끼를 먹는다
public class Person {
	// 필드 작성
	// 객체가 가지는 속성을 저장하기위해
	// 필요한 정보를 클래스 안에서 변수로 선언해서 객체마다 다른 값을 저장할 수 있도록 한다.
	String name;
	int age;
	String address;
	String phone;
	
	public Person() {;}

	public Person(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	void work() {
		System.out.println(name + "은(는) 일을 한다");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}








