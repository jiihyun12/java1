package exception;

public class ExeptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
	
//		try catch 단축키
//		Alt Shift Z
		try {
//			System.out.println(arData[10]); 
			arData[0] = 20;
			System.out.println(arData[0] / num );
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 똑바로 확인하세요.");
		} catch (ArithmeticException e) { 
			System.out.println("0으로 나눌 수 없다!");
		} catch (Exception e) { // Exception 모든 오류를 잡는다.
			e.printStackTrace();  // 오류가 발생한 지점을 찾아서 보여준다.
			
//		} catch (ArithmeticException e) { // 데드코드. 위에서 부모가 이미 오류를 다 잡았다. 
											// 엄마보다 더 먼저 나오게 처리하면 해결!
//			System.out.println("0으로 나눌 수 없다.");
		}
	}
}



























