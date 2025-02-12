package anonymousTest;

public class Starbucks {
	public void register(Form form) {
		String[] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		판매중인 곳인지, 무료 나눔을 하고 있는 곳인지 판별
		form.sell("아메리카노");
		form.free("무료 나눔");
	}
}














