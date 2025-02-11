package inheritenceTest;

class A {
	String name;
	int data;
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
}
	
class B extends A{
//	String name; // 보이지 않지만 이미 A의 값을 갖고있다.
//	int data;
	
	public B() {
		super(); // 상속을 물려받은 부모의 키워드를 호출해준다.
		// 생략이 돼있어도 자동으로 컴파일러가 호출한다.
		// 부모 필드에 접근할 수 있는 주소값을 가지고있다.
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	void prinData() {
		System.out.println(data);
	}
}
	



public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B(); // B라는 클래스로 객체화
		// 메모리에는 부모를 먼저 할당시키고 자식이 올라가기때문에 B를 올렸더라도 A를 사용할 수 있다.
		b.prinData();
		b.printName();
		System.out.println(b);
	}

}
