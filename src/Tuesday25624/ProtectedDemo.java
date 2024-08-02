package Tuesday25624;

public class ProtectedDemo extends ProtectedDemoImp1 {

	public static void main(String[] args) {
		ProtectedDemo d=new ProtectedDemo();
		System.out.println(d.msg);
		d.add(10, 20);

	}

}
