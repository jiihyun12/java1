package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
		Character ksh = new Character("ksh", "사냥꾼");
		Monster[] monsters = {
			new Elf("요정", 10, 100), 
			new Oak("오크", 30, 250),
			new Men("인간", 1, 1000)
			
				
		};
		
		
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다.
//		오크 : 가죽을 얻는다
//		요정 : 날개를 얻는다
//		인간 : 갑옷을 얻는다.
		
//		for(int i = 0; i < monsters.length; i++) {
//			ksh.hunt(monsters[i]);
//		}
		
		for(Monster monster : monsters) {
			ksh.hunt(monster);
		}

	}
	
	// Monster[] monsters = { new Fairy(), new Orc(), new Human() };
//	→ 부모 클래스(Monster) 타입의 배열에 자식 클래스(Fairy, Orc, Human) 객체를 저장
	
//	 for (Monster monster : monsters) { ksh.hunt(monster); }
//	→ 배열을 순회하면서 hunt() 실행 → 각 몬스터에 맞는 보상 출력
}
