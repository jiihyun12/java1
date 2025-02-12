package abstract1;

public class WashigMachine extends Electronics1{ // 전자기기니까 상속을 받는다.
	
	// 메서드를 선언할 때 선언부가 부족해서 오류가 나기 때문에 
	// 반드시 만들어야한다. 강제성
	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 켜기");		
	}
	
	@Override
	public void off() {
		System.out.println("버튼 눌러서 전원 끄기");		
	}
}
