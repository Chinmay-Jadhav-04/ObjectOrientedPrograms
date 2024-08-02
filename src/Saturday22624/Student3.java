package Saturday22624;

public class Student3 {
	String name;
	int age;
	public void disp(String n,int a) {
		name=n;
		age=a;
	}
	
	public void show() {
		System.out.println(name+ "" +age);
	}

	public static void main(String[] args) {
Student3 s=new Student3();
		
		s.disp("jhon", 10);
		s.show();


	}

}
