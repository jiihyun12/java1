package anonymousTest;

public class Starbucks {
	
	public void register(Form form) { // 스타벅스 지점 등록
		String[] menu = form.getMemus(); // 해당 지점의 메뉴 출력
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		판매 중인 곳인지, 무료나눔을 하고 있는 곳인지 판별
		if(form instanceof FormetAdapter) {
			System.out.println("무료 나눔 행사중");
		}else {
			form.sell("에이드");
		}
	}
	
}
