package review1;

import java.util.Objects;

public class Car {
	String brand;
	int speed;
	
	 public Car() {;}

	public Car(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", speed=" + speed + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(speed, other.speed);
	}
	 
	public void accelerate(){
		speed += 10;
	}
	
	public void showInfo(){
		System.out.println(
				brand + " 속도 증가!\n" + "현재 속도 : " + speed + "km \n"
		);
	}
}
	
	 

