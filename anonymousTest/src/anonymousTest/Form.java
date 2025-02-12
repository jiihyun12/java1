package anonymousTest;

// 가입 양식
// 메뉴 받기, 판매
public interface Form {
	// 추상 메서드
	public String[] getMenus(); // 메뉴 받기
	public void sell(String menu); // 판매
	public void free(String free); // 나눔
}


