package Tuesday25624;

abstract class Shape{
	abstract void show();
}
abstract class Triangle{
	abstract void show();
}
class Square extends Shape{
	@Override
	void show() {
		System.out.println("This is sqaure");
	}
}
class Rectangle extends Triangle{
	@Override
	void show() {
		System.out.println("This is Triangle");
	}
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		Square s1=new Square();
		Rectangle r1=new Rectangle();
		
		s1.show();
		r1.show();

	}

}
