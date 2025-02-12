package castingTask2;

public class Character {
//	이름, 직업, 레벨
	String name;
	String job;
	int level;

	static {
		System.out.println("여행을 환영합니다");
	}
	
	{
		this.level = 1;
	}
	
	public Character() {;}

	public Character(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
//	사냥하는 메서드
//	요정, 오크, 사람
	public void hunt(Monster monster) {
		if(monster instanceof Elf) { // 이 몬스터가 Elf 타입인지 확인
			Elf elf = (Elf)monster; // 맞다면 다운캐스팅
			elf.get(); // "날개를 얻었습니다" 출력
			
		}else if(monster instanceof Oak) {
			Oak oak = (Oak)monster; 
			oak.get();
			
		}else if(monster instanceof Men) {
			Men men = (Men)monster;
			men.get();
		}
	}
	
}







