package abstract1;

public abstract class Electronics1 { // abstract 추상 클래스
	
//	추상 메서드
	public abstract void on(); // 선언
	public abstract void off() ; 
	
//	상수 : final
	public final void safe() { // 고정
		System.out.println("안전장치 가동");
	}
}
