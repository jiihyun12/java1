//	아래의 내용을 확인하고 올바른 클래스를 구현하고
//
//	1. 다음 표의 내용을 보고 Calulator 클래스 내에 메소드를 구현하고 결과를 출력한다.
//	패키지명 : ex01
//	Calculator 클래스
//
//	메서드(calcNum)
//	정수형 2개의 ‘매개변수’를 넘겨 받아, 더한 값을 출력해주는 기능을 가진 메소드 구현
//
//	메서드(calcNum)
//	정수형 1개, 실수형 1개의 ‘매개변수’를 넘겨 받아 더한 결과값을 반환(return)해 주는 기능을 가진 메소드 구현
//
//	메서드(calcNum)
//	실수형 1개를 ‘매개변수’로 넘겨 받아 정수형으로 바꿔주고 결과값을 반환(return)해 주는 기능을 가진 메소드 메소드 구현
//
//	메서드(calcNum)
//	문자열 매개변수 2개를 넘겨받아 연결해서 출력하는 기능을 가진 메소드
//
//	 
//	메인 메소드   
//
//	클래스의 객체를 메모리에 할당하여, 클래스 객체가 가진 모든 메소드 호출하여
//	오류를 검증하고 결과 확인한다.

package homeWork;

public class Homework1 {
	 
//	메서드(calcNum)
//	정수형 2개의 ‘매개변수’를 넘겨 받아, 더한 값을 출력해주는 기능을 가진 메소드 구현
	public void calcNum (int num1, int num2) {
		int result1 = num1 + num2;
		System.out.println(result1);
	}
	
//	메서드(calcNum)
//	정수형 1개, 실수형 1개의 ‘매개변수’를 넘겨 받아 더한 결과값을 반환(return)해 주는 기능을 가진 메소드 구현
	public double calcNum (int num11, double num12) {
		double result2 = (double)(num11) + num12;
		return result2;
	}
	
//	메서드(calcNum)
//	실수형 1개를 ‘매개변수’로 넘겨 받아 정수형으로 바꿔주고 결과값을 반환(return)해 주는 기능을 가진 메소드 메소드 구현
	public int calcNum (double num21) {
		int num22 = (int)num21;
		return num22;
	}
	
	
//	메서드(calcNum)
//	문자열 매개변수 2개를 넘겨받아 연결해서 출력하는 기능을 가진 메소드
	public void calcNum(String str1, String str2) {
		String strResult = str1 + str2;
		System.out.print(strResult);
	}
	
	
//	메인 메소드   
//	클래스의 객체를 메모리에 할당하여, 클래스 객체가 가진 모든 메소드 호출하여
//	오류를 검증하고 결과 확인한다.
	public static void main(String[] args) {
		Homework1 hw = new Homework1();
		int num1 = 5, num2 = 4;	
		hw.calcNum(num1, num2);
		
		
		int num11 = 10;
		double num12 = 6.8;
		double result2 = hw.calcNum(num11, num12);
		System.out.print(result2);
		
		
		double num21 = 7.7;
		System.out.println();
		int result3 = hw.calcNum(num21);
		System.out.println(result3);
		
		
		String str1 = "자바랑 ", str2 = "맞짱";
		hw.calcNum(str1 , str2);
		
	}
}



// A. return값을 직접 저장해야 사용할 수 있는 게 헷갈림 
// 3. 이미 형변환을 했는데 main에서 한 번 더 형변환 하는 게 맞는지?
