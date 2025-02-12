package castingTask2;

// 부모 클래스
public class Monster {
	String name;
	int hp;
	int experience;
	
	public Monster() {;}

	public Monster(String name, int hp, int experience) {
		this.name = name;
		this.hp = hp;
		this.experience = experience;
	}
	
	void get() { // 몬스터를 잡았을 때 나오는 기본 메시지
		System.out.println("몬스터를 잡았습니다.");
		System.out.println("아이템을 얻었습니다");
		System.out.println(experience + "경험치를 얻었습니다");
	}
	
}
