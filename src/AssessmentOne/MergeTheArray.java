package AssessmentOne;
//TODO: Its not working yet.........
import java.util.Arrays;
public class MergeTheArray {
    public static void main(String[] args) {
        int[] arrayOne = {1,3,4,5};
        int[] arrayTwo = {2,6,7,8};

        int add1 = arrayOne.length;
        int add2 = arrayTwo.length;

        int add = add1+add2;
        int[] newArray = new int[add];

        System.arraycopy(arrayOne, 0, newArray, 0, add1);
        System.arraycopy(arrayTwo, 0, newArray, add1, add2);

        System.out.println(Arrays.toString(newArray));
    }
}
