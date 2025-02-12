package abstract1;

public class Tiger extends PetAdapter {
	
//	강제성을 없앴기때문에
//	없어도 오류가 나지 않는다.
//	@Override
//	public void poop() {
//		// TODO Auto-generated method stub
//		
//	}
	
	@Override
	public void sitDown() {
		System.out.println("호랑이는 앉지 않는다.");	
	}
	
	@Override
	public void waitNow() {
		System.out.println("호랑이는 기다리지 않는다.");
		
	}
	
//	Adepter
//  강제성을 필요한것들만 구현하게 해준다.
	

}
