// 복습 및 예제

// Car 클래스를 상속받는 ElectricCar 만들기
//요구사항
//Car 클래스 만들기
//brand(브랜드)와 speed(속도) 멤버 변수를 포함
//accelerate() 메서드를 만들어 속도를 10 증가
//showInfo() 메서드로 브랜드와 속도를 출력

//ElectricCar 클래스를 추가해서 Car 클래스를 상속받기
//batteryLevel(배터리 잔량) 필드 추가
//chargeBattery() 메서드를 만들어 배터리를 충전하는 기능 추가

//main()에서 객체 생성 및 메서드 호출
//ElectricCar 객체를 생성
//accelerate()와 chargeBattery() 메서드를 호출
//showInfo()로 속도와 배터리 잔량을 출력

package review1;

import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("브랜드를 입력하세요");
		String brand = sc.nextLine();
		
		System.out.println("초기 속도를 입력하세요");
		int speed = sc.nextInt();
		
		System.out.println("초기 배터리 잔량을 입력하세요");
		int batteryLevel = sc.nextInt();
		
		ElectricCar electricCar = new ElectricCar(brand, speed, batteryLevel);
					
		electricCar.accelerate();
		electricCar.chargeBattery();	
			
		electricCar.showInfo();
					
	}		
}


