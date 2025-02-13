package anonymousTest;

public abstract class FormetAdapter implements Form{
	
	// 일부 객체는 sell()을 사용하지 않을 수도 있으므로, 
	// 필요 없는 메서드를 강제하지 않기 위해 생성
	@Override
	public void sell(String menu) {;}
}
