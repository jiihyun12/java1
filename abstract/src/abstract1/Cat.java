package abstract1;

public class Cat implements Pet {
	
	@Override
	public void poop() {
		System.out.println("고양이 모레에 배변훈련");	
	}
	
	@Override
	public void sitDown() {
		System.out.println("앉는다.");
		
	}
	
	@Override
	public void waitNow() {
		System.out.println("도망간다.");	
	}
	
}
