package AssessmentOne;

public class test {
    public static void main(String[] args) {
        System.out.println(swapDigits(12345));
    }

    public static int swapDigits(int number) {
        int fifthDigit = number % 10;
        int fourthDigit = (number / 10) % 10;
        int thirdDigit = (number / 100) % 10;
        int secondDigit = (number / 1000) % 10;
        int firstDigit = (number / 10000) % 10;

        int swappedNumber = thirdDigit * 10000 + fifthDigit * 1000 + firstDigit * 100 + fourthDigit * 10 + secondDigit;

        return swappedNumber;
    }
}
