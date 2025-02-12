package castingTask2;

public class Men extends Monster{
	public Men() {;}
	public Men(String name, int hp, int experience) {
		super(name, hp, experience);
	}	
	
	@Override
	void get() {
		System.out.println("갑옷을 얻었습니다.");
	}
}
