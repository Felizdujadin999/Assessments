package AssessmentOne;

import java.util.Scanner;

public class EstimateE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate (integer value): ");
        int numTerms = scanner.nextInt();

        double eEstimate = calculateE(numTerms);

        System.out.println("Estimated value of e with " + numTerms + " terms: " + eEstimate);
    }

    public static double calculateE(int numTerms) {
        double eEstimate = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= numTerms; i++) {
            factorial *= i;
            eEstimate += 1.0 / factorial;
        }

        return eEstimate;
    }
}
