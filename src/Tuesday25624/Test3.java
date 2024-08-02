package Tuesday25624;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in subject 1 (out of 100): ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks in subject 2 (out of 100): ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks in subject 3 (out of 100): ");
        int marks3 = scanner.nextInt();

        int totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300.0) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

	}

}
