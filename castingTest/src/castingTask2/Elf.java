package castingTask2;

public class Elf extends Monster{ // 부모 클래스 Monster를 상속받음
	public Elf() {;}
	public Elf(String name, int hp, int experience) {
		super(name, hp, experience);
	}	
	
	@Override
	void get() { // get메서드를 오버라이딩하여 각 몬스터마다 보상이 다 다르게 출력된다.
		System.out.println("날개를 얻었습니다.");
	}
}
