package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Prob4 {

    void main() {
        int[] arr = {5, -3, 6, 70, 9, 4};

        int maxVal = findMaxFromArray(arr);

        System.out.println("Your array: " + Arrays.toString(arr));
        System.out.println("Max value is: " + maxVal);
    }

    public int findMaxFromArray(int[] arr) {
        return findMaxValue(arr, 0);
    }

    private int findMaxValue(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];

        int maxInRest = findMaxValue(arr, idx + 1);

        if (maxInRest > arr[idx]) {
            return maxInRest;
        } else {
            return arr[idx];
        }
    }
}
