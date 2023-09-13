package AssessmentOne;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();

            int age = Integer.parseInt(input);

            if (age >= 0 && age <= 120) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
            }
        }
            System.out.println("Thank you! Age accepted.");
    }
}

