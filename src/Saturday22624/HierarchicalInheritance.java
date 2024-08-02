package Saturday22624;

class Mother{
	String name="Ruchita";
}
class Daughter1 extends Mother{
	String d1name="Samruddhi";
	String d1education="MCom";
	
}
class Daughter2 extends Mother{
	String d2name="Samiksha";
	String d2education="BCom";
	
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Daughter1 d=new Daughter1();
		Daughter2  d1=new Daughter2();
		
		System.out.println("Mother name:"+d.name+" \n"+d.d1name+" "+d.d1education);
		System.out.println(d1.d2name+" "+d1.d2education);

	}

}
