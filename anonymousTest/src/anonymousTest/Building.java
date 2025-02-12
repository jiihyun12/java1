package anonymousTest;

// 잠실점 오픈
//무료 나눔 행사중
//무료 나눔 행사중이라면, "무료나눔 행사 승인"출력
//무료나눔 행사 중이 아니라면, 판매 

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() { // 양식을 받을 때
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println( menus[i]+ " 판매 완료");
						break;			
					}				
				}
			}
			
			@Override
			public void free(String free) {
				System.out.println("강남점은 무료 나눔을 진행하지 않습니다.");
				
			}
					
					@Override
					public String[] getMenus() {
						return new String[] {"아메리카노"};		
				}	
					
					
		});
		
//		잠실점 등록
		Starbucks jamsil = new Starbucks();
		jamsil.register(new Form() {
			
//			강제성을 없애기 위해 어댑터 만들기
		@Override
			public void sell(String menu) {
			// TODO Auto-generated method stub
					
				}
			
		@Override
			public void free(String free) {
				if(free.equals("무료 나눔"));
				System.out.println("무료 나눔 행사 승인");
			}
		

		@Override
		public String[] getMenus() {
			return new String[] {"아메리카노","라테","에이드"};		
	}
			
		});
		
		
		
		
		
		
	}
}
