package Tuesday25624;

interface Employee{
	String name="jhon";
	void showEmp() ;
		
}
interface Company{
	String compName="LNT";
	void showComp();
}
interface Department extends Employee,Company{
	String deptName="Java Team";
	void showDept();
}
class Details implements Department{

	@Override
	public void showEmp() {
		System.out.println("Employee Name:"+name);
		
	}

	@Override
	public void showDept() {
		System.out.println("Department Name:"+deptName);
		
	}

	@Override
	public void showComp() {
		System.out.println("Company Name:"+compName);
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Details d1=new Details();
		d1.showComp();
		d1.showEmp();
		d1.showDept();


	}

}
