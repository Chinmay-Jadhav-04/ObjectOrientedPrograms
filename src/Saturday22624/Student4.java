package Saturday22624;

class StudentApp{
	String sname;
	int sroll;
	void disp(String n,int r) {
		sname=n;
		sroll=r;
		System.out.println(sname+" "+sroll);
	}
}

public class Student4 {

	
	public static void main(String[] args) {
		StudentApp s=new StudentApp();
		s.disp("Tanuj",21);
		StudentApp s1=new StudentApp();
		s1.disp("Chinmay",32);
	}

}
