package castingTask2;

public class Oak extends Character{

	public Oak(String name, int level) {
	     super(name, "오크", level);
	 }
	
	@Override
	public void hunt() {
		System.out.println(name + level + "가죽을 얻는다.");
	}
}
