package Assignment3;

import java.util.Arrays;

public class Prob2 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 13};

        if (arr == null || arr.length == 0) {
            System.out.println("Array is Null");
            return;
        }

        int[] revArr = reversedArray(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(revArr));
    }

    private static void reverseArrayByIndex(int[] arr, int[] revArr, int idx) {
        if (idx == arr.length) {
            return;
        }
        revArr[idx] = arr[arr.length - 1 - idx];
        reverseArrayByIndex(arr, revArr, idx + 1);
    }

    public static int[] reversedArray(int[] arr) {
        int[] revArr = new int[arr.length];
        reverseArrayByIndex(arr, revArr, 0);
        return revArr;
    }
}
