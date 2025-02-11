package castingTask2;

public class Elf extends Character{

	 public Elf(String name, int level) {
	     super(name, "요정", level);      
	 }

	 @Override
	public void hunt() {
		 System.out.println(name + level + "날개를 얻는다.");
	 }
}
