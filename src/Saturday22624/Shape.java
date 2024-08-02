package Saturday22624;

class Circle{
	
	int r=10;
	void cArea() {
		System.out.println("Area of circle:"+3.14*r*r);
	}
}
class Rectangle{
	int l=10,b=20;
	void rArea() {
		System.out.println("Area of Rectangle:"+(l*b));
	}
	
}

public class Shape {

	public static void main(String[] args) {
        Circle c=new Circle();
		
		c.cArea();
		Rectangle r=new Rectangle();
		r.rArea();

	}

}
