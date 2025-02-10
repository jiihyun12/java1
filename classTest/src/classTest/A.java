package classTest;

public class A {
	int data; // class 전역에서 사용할 수 있는 전역 변수(멤버 또는 필드라고 부른다.)

	// 생성자를 만들면 기본 생성자가 필요하다.
	// 기본 생성자 Ctrl space --> 클래스 만들면 기본 생성자부터 만들어야한다.
	public A() {;}
		
	// 값을 초기화 시키기 위한 생성자
	public A(int data) {
//		data = data; // 0 0 출력
		this.data = data; // 10 20 출력
	} // this는 접근하는 자기 자신의 주소값을 가지고있다.
	
	void printData() {
		System.out.println(this); // 주소 출력
		System.out.println(this.data); // 각각의 주소 출력
	}

	public static void main(String[] args) {
		A a = new A(10); // 객체화
		A b = new A(20);
//		System.out.println(a.data);
//		System.out.println(b.data);
		
		// 주소값이 다른 것을 확인
		a.printData();
		b.printData();
	}
}
