package homeWork;
//3. 다음 표의 내용을 보고 각 클래스 내에 메소드를 구현하고 결과를 출력한다.
//
//패키지명 : ex03

public class PersonMain {
	
//	PersonMain 클래스
//	main 메소드를 구성하여 아래의 조건을 모두 실행하세요.
	public static void main(String[] args) {
//		메서드
//		1.학생(student), 프로그래머(programmer)를 Person 클래스 타입으로 업캐스팅하여 객체화(instance)를 생성한다.
		Person studentPerson = new Student("함지현", 20, "학생", "독서", 112010515);
		Person programmerPerson = new Programmer("뎐", 20, "개발자", "개발", true);
		
//		2. Person으로 업캐스팅한 객체를 다운캐스팅하여 
//		각각 아래에 메서드를 모두 호출하세요
		if( studentPerson instanceof Student ) { // studentPerson이 Student인지 확인
			Student student = (Student) studentPerson; // 다운캐스팅
			student.work();
			student.hobby();
			student.printNumber();
		}
	
		if( programmerPerson instanceof Programmer ) { // studentPerson이 Student인지 확인
			Programmer programmer = (Programmer) programmerPerson; // 다운캐스팅
			programmer.work();
			programmer.hobby();
			programmer.isNotebook();
		}
		
//		Student : work, hobby, printNumber
//		programmer : work, hobby, isNotebook;

		
	}
	
}
