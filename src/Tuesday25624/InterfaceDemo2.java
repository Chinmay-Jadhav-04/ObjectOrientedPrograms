package Tuesday25624;

interface Bank{
	public void getRoi(double rate);
}
class BOI implements Bank{

	@Override
	public void getRoi(double rate) {
		System.out.println("Bank of intrest of BOI is:"+rate);
		
	}
	
}
class BOB implements Bank{

	@Override
	public void getRoi(double rate) {
		System.out.println("Bank of intrest of BOB is:"+rate);
		
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Bank b1,b2;
		b1=new BOB();
		b2=new BOI();
		
		b1.getRoi(12.13);
		b2.getRoi(10.02);

	}

}
