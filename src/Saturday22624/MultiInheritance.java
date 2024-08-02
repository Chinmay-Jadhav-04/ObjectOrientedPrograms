package Saturday22624;

class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("Meow Meow");
	}
}
class Tiger extends Cat{
	void roar() {
		System.out.println("Roaring...");
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		Tiger t1=new Tiger();
		
		t1.bark();
		t1.eat();
		t1.meow();
		t1.roar();

	}

}
