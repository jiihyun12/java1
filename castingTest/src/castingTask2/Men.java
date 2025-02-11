package castingTask2;

public class Men extends Character {
	public Men(String name, int level) {
	     super(name, "인간", level);     
	}
	
	@Override
	public void hunt() {
		System.out.println(name + "갑옷을 얻는다.");
	}
}
