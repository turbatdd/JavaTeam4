package Assignment1;

import java.util.Arrays;

public class Prog5 {
    void main() {

        int[] arr = {-2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
//        int[] arr = {1, 20, 45, 23, 33, 44, 11, 22, 17};

        System.out.println("Array is = " + Arrays.toString(arr));

        int minNum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int r = arr[i];

            if (r < minNum) {
                secondMin = minNum;
                minNum = r;
            } else if (secondMin > r && minNum != r) {
                secondMin = r;
            }
        }
        System.out.println("First Min number is = " + minNum);
        System.out.println("Second Min number is = " + secondMin);
    }
}
