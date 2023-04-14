package AssessmentOne;

import java.util.Arrays;

public class ProductOfAllElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(modifyList(new int[]{1, 2, 3, 4}))   );
    }
    public static int[] modifyList(int[] arr) {
        int number = arr.length;
        int[] left = new int[number];
        int[] right = new int[number];
        left[0] = 1;
        right[number-1] = 1;

        for(int i=1; i<number; i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        for(int i=number-2; i>=0; i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i=0; i<number; i++) {
            arr[i] = left[i] * right[i];
        }
        return arr;
    }

}
