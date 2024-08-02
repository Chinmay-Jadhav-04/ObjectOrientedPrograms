package Saturday22624;

class Doctor{
	String name="Dr.Pramod Salunkhe";
	String degree="MBBS.Mumbai";
}
class Patient extends Doctor{
	String pname="Tanuj Gawande";
	String disease="Heart Attack";
	
	void disp() {
		System.out.println("\nDoctor Name:"+name+"\nDegree:"+degree+"\nPatient Name:"+pname+"\nPatient Disease:"+disease);
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		Patient p1=new Patient();
		p1.disp();

	}

}
