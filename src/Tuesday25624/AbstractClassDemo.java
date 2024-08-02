package Tuesday25624;

abstract class Capgemini{
	String address="Dombivli";
	void disp() {
		System.out.println("Hi,My name is chinmay");
	}
	abstract void show();
}
class Cp extends Capgemini{
	
	@Override
	void show() {
		System.out.println("How are you?");
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Cp c=new Cp();
		System.out.println(c.address);
		c.disp();
		c.show();

	}

}
