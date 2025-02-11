package inheritenceTest;

class Car {
	String brand;
	String color;
	long price;
	
	public Car() {;}
	public Car(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}
	

class Supercar extends Car{
	String mode;
	public Supercar() {;}
	
	public Supercar(String brand, String color, String mode, long price) {
		super(brand, color, price);
		this.mode = mode;	
	}
	
	@Override
	void engineStart() {
		System.out.println("음성 시동 켜짐");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성 시동 꺼짐");
	}
}

public class InharitanceTask1 {
	public static void main(String[] args) {
		Car matiz = new Car("기아", "빨강", 1000000); 
		Supercar ferrari = new Supercar();
		ferrari.engineStart();
	}
	
	
	}



















