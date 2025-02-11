package inheritenceTask;

//상속 및 분리 실습

// Person 클래스
class Person { 
// 이름, 나이, 주소, 핸드폰 번호
	String name;
	int age;
	String address;
	String phoneNumber; 
	
	public Person(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Person() {;}

// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다
	
	void doWork() {
		System.out.println("일을 한다.");
	}
	void isSleep() {
		System.out.println("잠을 잔다.");
	}
	void isEat() {
		System.out.println("세 끼를 먹는다.");
	}
}

// Student 클래스
class Student extends Person{
// 인스타아이디
// work 아르바이트를 한다
// sleep 수업 시간에 잠을 잔다
// eat 아침을 거른다
	String instaId;
	
	public Student(String name, int age, String address, String phoneNumber, String instaId) {
	     super(name, age, address, phoneNumber);
	     this.instaId = instaId;
	}
	
	@Override
		void doWork() {
			System.out.println("아르바이트 한다.");
		}
	
	void isSleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}

	void isEat() {
	     System.out.println("아침을 거른다.");
	 }
}


class Employee extends Person {
// Employee 클래스
// 비상금
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다
	int secretMoney; 
	 public Employee(String name, int age, String address, String phoneNumber, int secretMoney) {
	     super(name, age, address, phoneNumber);
	     this.secretMoney = secretMoney;
	 }
	 
	 @Override
		void doWork() {
		 System.out.println("하루 종일 일을 한다");
		}
	 
		void isSleep() {
			System.out.println("잠을 설친다");
		}

		void isEat() {
		     System.out.println("야식을 먹는다");
		 }

}

public class InheritanceTask2 {
//   메인 메서드 생성 후 객체화
//   각 메서드 출력하기
	public static void main(String[] args) {
		Person person = new Person("홍길동", 10, "서울시", "01012345678");
		person.doWork();
		person.isEat();
		person.isSleep();
		
//		Student student = new Student();
		
	}
}










 









