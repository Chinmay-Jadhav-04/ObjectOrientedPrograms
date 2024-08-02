package Tuesday25624;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        System.out.println("\n Hey, my name is:" + name + "\n and my roll number is: " + rollNumber + "\n My field of interest are: " + fieldOfInterest + ".");

	}

}
