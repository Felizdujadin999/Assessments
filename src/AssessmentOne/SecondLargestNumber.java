package AssessmentOne;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int digits = scanner.nextInt();
        int[] numArray = new int[digits];

        System.out.print("Enter " + digits + " numbers: ");
        for(int i=0; i<digits; i++) {
            numArray[i] = scanner.nextInt();
        }
        int largest = numArray[0];
        int secondLargest = numArray[0];

        for(int i=0; i<numArray.length; i++) {
            if(numArray[i] > largest) {
                secondLargest = largest;
                largest = numArray[i];
            }
            else if(numArray[i] > secondLargest && numArray[i] != largest) {
                secondLargest = numArray[i];
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
    }
}


