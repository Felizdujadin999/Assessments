package AssessmentOne;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (i == 1 || number > highest) {
                highest = number;
            }
            if (i == 1 || number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest number entered: " + highest);
        System.out.println("Lowest number entered: " + lowest);
    }
}

