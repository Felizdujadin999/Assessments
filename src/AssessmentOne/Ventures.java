package AssessmentOne;

public class Ventures {
    public static void main(String[] args) {
        String word = "VENTURES";
        for (int i = 0; i < word.length(); i += 2) {
            System.out.println(word.charAt(i) + "" + word.charAt(i + 1));
        }
    }
}