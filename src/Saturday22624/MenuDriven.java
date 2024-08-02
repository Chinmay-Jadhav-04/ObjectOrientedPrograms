package Saturday22624;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First String:");
		String s1=sc.next();
		
		System.out.println("Enter your Second String:");
		String s2=sc.next();
		
		System.out.println("Enter your Third String:");
		String s3=sc.next();
		
		/*System.out.println(s1.concat(s2));
		String A=sc.next();
		
	 
		
		
		System.out.println(s1.compareTo(s2));
		String B=sc.next();
		System.out.println(s2.compareTo(s1));
		String C=sc.next();
		System.out.println(s1.compareTo(s3));
		String D=sc.next();		
		
		System.out.println(s1.trim());
		String E=sc.next();
		
		System.out.println(s2.toUpperCase());
		String F=sc.next();
		System.out.println(s3.toLowerCase());
		String G=sc.next();*/
		
		do {
			System.out.println("Press 1:Enter String and Perform Concat:");
			System.out.println("Press 2:Compare To():");
			System.out.println("Press 3:Trim():");
			System.out.println("Press 4:Upper and Lower:");
			System.out.println("Press 5:Exit:");
			System.out.println("Enter Choice");
			
			ch=sc.nextInt();
			

			switch(ch) {
			case 1:
				System.out.println(s1.concat(s2));
				//System.out.println("Enter String and Perform Concat:" +"\ns1:" +s1+ "\ns2:"+s2+"\ns3:"+s3+"\nA:"+A);
				break;
			case 2:
				System.out.println(s1.compareTo(s2));
				//System.out.println("Compare To():"+"\nB:"+B+"\nC:"+C+"\nD:"+D);
				break;
			case 3:
				System.out.println("Enter String:");
				String msg=sc.next();
				System.out.println(msg.trim());
				//1System.out.println("Trim():" +E);
				break;
			case 4:
				System.out.println(s1.toLowerCase());
				System.out.println(s1.toUpperCase());
				//System.out.println("Upper and Lower:"+"\nF:"+F+"\nG:"+G);
				break;
			case 5:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Wrong Choice");
		}

	}while(ch!=5);

  }
}
