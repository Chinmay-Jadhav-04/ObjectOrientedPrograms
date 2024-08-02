package Saturday22624;

class Vehicle{
	int speed=120;
}
class Maruti extends Vehicle{
	String color="black";

}
class Bike extends Maruti{
	String model="2021 year";
}
class Bycycle extends Bike{
	int prise=12000;
}
public class MultiInheritance1 {

	public static void main(String[] args) {
		Bycycle b=new Bycycle();
		System.out.println("Bike Model:"+b.model+"\nMaruti color: "+b.color+"\nVehicle speed: "+b.speed+" \nBycycle prise:"+b.prise);

	}

}
