package castingTask2;

public class Oak extends Monster {
	public Oak() {;}
	public Oak(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	@Override
	void get() {
		System.out.println("가죽을 얻었습니다.");
	}
	
}
