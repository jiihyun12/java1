package methodTest;

// 왜 주소를 넘겨야 값이 바뀔 수 있는지
public class LocationTest {
	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}
	
	public static void main(String[] args) {
		LocationTest ts = new LocationTest();
		int[] data = {50};
//		int data = 50;
		ts.test(data);
		System.out.println(data[0]);
	}
}
