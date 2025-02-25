package review1;

import java.util.Objects;

public class ElectricCar extends Car {
	private int batteryLevel;
	
	public ElectricCar() {;}

	public ElectricCar(String brand, int speed, int batteryLevel) {
		super(brand, speed);
		this.batteryLevel = batteryLevel;
	}

	@Override
	public String toString() {
		return "ElectricCar [batteryLevel=" + batteryLevel + "]";
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryLevel);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricCar other = (ElectricCar) obj;
		return Objects.equals(batteryLevel, other.batteryLevel);
	}
	
	public void chargeBattery(){
		batteryLevel += 50;
	}
	
	@Override
	public void showInfo(){	
		System.out.println(
				brand + " 속도 증가!\n" + "현재 속도 : " + speed + "km \n"+
				brand + "배터리 충전됨 ! \n" + "현재 배터리" + batteryLevel + "%"
		);
	}	
}
