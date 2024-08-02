package Tuesday25624;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of person 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter age of person 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter age of person 3: ");
        int age3 = scanner.nextInt();

        int oldest = age1;
        int youngest = age1;

        if (age2 > oldest) {
            oldest = age2;
        }
        if (age3 > oldest) {
            oldest = age3;
        }

        if (age2 < youngest) {
            youngest = age2;
        }
        if (age3 < youngest) {
            youngest = age3;
        }

        System.out.println("Oldest person is " + oldest + " years old.");
        System.out.println("Youngest person is " + youngest + " years old.");

	}

}
