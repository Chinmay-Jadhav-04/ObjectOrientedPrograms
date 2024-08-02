package Tuesday25624;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter third number: ");
	        int num3 = scanner.nextInt();

	        if (num1 == num2 && num2 == num3) {
	            System.out.println("All three numbers are equal.");
	        } else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
	            System.out.println("At least two numbers are equal.");
	        } else {
	            System.out.println("None of the numbers are equal.");
	        }

	}

}
