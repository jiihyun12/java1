package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
		
//		implement한 것과 동일하지만, 한 번만 사용하기 위해 작성한다.(1회용)
		Study study = new Study() { 
			@Override
			public void setTopic(String topic) { 
				System.out.println("주제" + topic);
				
			}
		}; // 내부 익명 클래스
		study.setTopic("화학");
	}
}

//익명 클래스
//재사용이 필요없다.
