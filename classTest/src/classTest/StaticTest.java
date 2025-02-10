package classTest;

public class StaticTest {
	
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); // 객체화
		
//		메모리 낭비를 하고 있는데도 오류가 안 생기는 이유는
//		가비지컬렉터 떄문
		st.increase_s(); 
		st.increase_s(); 
		st.increase_s(); 
		st.increase_s(); 
		st.increase_s(); 
		st = new StaticTest(); // new 연산자는 heap에 올라간다.
							// 위의 sataic에 올린 값을 heap에 다시 올릴 수 없다.
		increase_s(); 
		increase_s(); 
		increase_s(); 
		increase_s(); 
		increase_s(); 
	
		
		
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st = new StaticTest(); // 주소값이 바꼈다.
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
	}
	
	// static 키워드 --> 컴파일러가 메모리 상에서 맨 위로 올려준다.
	// 클래스 없이도 

}
