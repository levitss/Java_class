package kr.co.ezenac.overloading03;

public class Car {
	String color;
	String gearType;
	int door;
	public Car() {
//		this.color="Yellow";
//		this.gearType="auto";
//		this.door=4;
		this("Yellow","Auto",4);
	}
	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}
