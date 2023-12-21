package myPackage;

class Car{
	String carName;
	long price;
	
	public Car(String carName, int price) {
		super();
		
		this.carName = carName;
		this.price = price; 
	}
}

public class Constructors{
	public static void main(String[] args) {
		Car c1=new Car("XUV600",2500000);
		Car c2=new Car("Audi",2500000);
		System.out.println("First Car Details : ");
		System.out.println(c1.carName);
		System.out.println(c2.price);
		System.out.println("Second Car Details : ");
		System.out.println(c2.carName);
		System.out.println(c2.price);
	}
}
