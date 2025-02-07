package methodTask;

import method.MethodTest01;

public class MethodTask1 {
//  1~10까지 println으로 출력하는 메서드
//	int printNums(int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10){
//		return num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
//	}
//	public static void main(String[] args) {
////		클래스명 변수명 = new 클래스명();
//		MethodTask1 nums = new MethodTask1();
//		nums.printNums(1,2,3,4,5,6,7,8,9,10);
//		System.out.println(result);
//	}
	
	
	
//  "홍길동" 이름을 n번 println()으로 출력하는 메서드
	void printName(int name) {
		int input = 0;
		for(int i = 0; i <= input; i++) {
			System.out.println("홍길동");
		}
	}
	public static void main(String[] args) {
		MethodTask1 name = new MethodTask1();
		name.printName(5);
	}
  
//  결과를 콘솔에 출력하기

}
