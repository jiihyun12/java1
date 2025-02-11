package access1;

public class Access1 {
	int data1; // default (다른 패키지에서는 접근할 수 없다.)
	public int data2; // 패키지가 달라도 누구나 이용할 수 있다.
	protected int data3; // 다른 패키지에서 접근할 수 없지만 자식은 접근할 수 있다.
	private int data4; // 값에 직접 접근하지 말라고 쓰는것 	
	// private을 보면 메서드를 만들어야한다.  --> getter와 setter
	
	public Access1() {;}
	
	public int getData4() {
		return data4; 
	}          
	
	public void setData4(int data4) {
		this.data4 = data4;
	}
}
