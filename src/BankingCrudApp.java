

import java.util.Scanner;
class Bank{
	private String accno;
	private String name;
	private long balance;
	
	Scanner s=new Scanner(System.in);
	
	//open account
	
	void addAccountDeatils() {
		System.out.println("Enter account number:");
		accno=s.next();
		System.out.println("Enter Account holder name:");
	     name=s.next();
	     System.out.println("Enter current balance");
	     balance=s.nextLong();
	      
	}
	//Account diaplay(read account details)
	
	void showAccountDetails() {
		System.out.println("Account number:"+accno+
				"\nAccount holder name:"+name+"\nCurrent balance:"+balance);
		
	}
	//deposite money
	void depositeMoney() {
		long amount;
		System.out.println("Enter Amount to deposite:");
		
		amount=s.nextLong();
		balance=balance+amount;
		System.out.println("After depositing balance is:"+balance);
	}
	//widhtra money
	void widMoney() {
		long amount;
		System.out.println("Enter how much money u want to widhraw:");
		amount=s.nextLong();
       if(balance>=amount) {
    	   balance=balance-amount;
   		System.out.println("After widhrawing money balanace is:"+balance);  
       }
       else {
    	   System.out.println("Insufficient balance Sorry(:(:!!!!!!");
       }
	}
	//search account
	
	boolean searchAccount(String an) {
		if(accno.equals(an)) {
			showAccountDetails();
			return true;
		}
		return false;
	}
}
public class BankingCrudApp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter How many Customer account u want to add");
	
	int n=sc.nextInt();
	
	Bank b[]=new Bank[n];
	
	for(int i=0;i<b.length;i++) {
		b[i]=new Bank();
		b[i].addAccountDeatils();
	}
	int ch;
	do {
System.out.println("Welcome to Banking System");

System.out.println("Press 1 : Display Account Details");
System.out.println("Press2:Deposite Money");
System.out.println("Press 3: Widhtraw Money");
System.out.println("Press 4:Search Bank Account");
System.out.println("press 5:Exit");
	
	System.out.println("Enter choice:");
	ch=sc.nextInt();
	switch(ch) {
	case 1:
		for(int i=0;i<b.length;i++) {
			b[i].showAccountDetails();
		}
		break;
	case 2:
		System.out.println("Enter Account no");
		String accno=sc.next();
		boolean found=false;
	    for(int i=0;i<b.length;i++) {
	    	found=b[i].searchAccount(accno);
	    	if(found) {
	    		b[i].depositeMoney();
	    		break;
	    	}
	    }
	    if(!found) {
	    	System.out.println("Search failed");
	    }
	    break;
	
	case 3:
		System.out.println("Enter Account no");
		 accno=sc.next();
		 found=false;
	    for(int i=0;i<b.length;i++) {
	    	found=b[i].searchAccount(accno);
	    	if(found) {
	    		b[i].widMoney();
	    		break;
	    	}
	    }
	    if(!found) {
	    	System.out.println("Search failed");
	    }
	    break;
	case 4:
		System.out.println("Enter which Account no u want search");
		 accno=sc.next();
		 found=false;
	    for(int i=0;i<b.length;i++) {
	    	found=b[i].searchAccount(accno);
	    	if(found) {
	    		b[i].searchAccount(accno);
	    		break;
	    	}
	    }
	    if(!found) {
	    	System.out.println("Search failed");
	    }
	    break;
	case 5:
		System.out.println("Bye Bye");
		break;
		default:
			System.out.println("Wrong choice!");
	}

	
	}while(ch!=5);

}
}