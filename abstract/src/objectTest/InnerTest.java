package objectTest;

public class InnerTest {
	
	public class InnerTest2{
		private int value;
		
		// 초기화블럭
		{
			this.value = 20;
		}
		
		public InnerTest2() {;}
		
		public void setValue(int value){
			this.value = value;
		}
		
		public int getValue() {
			return this.value; 
		}
	}
		
		public static void main(String[] args) {
//			InnerTest2 it2 = new InnerTest2 // 은닉화 직접 접근할 수 없다. 클래스를 이용하여 접근해야한다. 
			InnerTest2 it2 = new InnerTest().new InnerTest2();
			System.out.println(it2.getValue());
		}
		
	
}
