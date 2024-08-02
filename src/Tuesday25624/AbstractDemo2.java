package Tuesday25624;

abstract class Vehicle{
	String color="Blue";
	
	abstract void Speed(int s);
	void warranty() {
		System.out.println("5 years of warranty");
	}
}
class Car extends Vehicle{
	
	@Override
	void Speed(int s) {
		System.out.println("Speed is:"+s);
	}
	
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Car v=new Car();
		System.out.println("Vehicle color:"+v.color);
		
		v.Speed(100);
		v.warranty();
		

	}

}
