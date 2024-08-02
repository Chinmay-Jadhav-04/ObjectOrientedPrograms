package Saturday22624;

class Circle1{
	
	int r=10;
	void cArea() {
		System.out.println("Area of circle:"+3.14*r*r);
	}
}
class Rectangle1 extends Circle1{
	int l=10,b=20;
	void rArea() {
		System.out.println("Area of Rectangle:"+(l*b));
	}
	
}

public class Shape2 {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		r.cArea();
		r.rArea();

	}

}
