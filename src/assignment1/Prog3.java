package assignment1;

import java.util.Arrays;

public class Prog3 {

    void main() {
        String[] arr = new String[]{"horse", "horse", "dog", "cat", "horse", "dog"};
        String[] arr2 = new String[0];

        System.out.println("initail Array = " + Arrays.toString(arr));
        for (String str : arr) {
            Object[] rawArrary = Arrays.stream(arr2).filter(r -> r == str).toArray();

            if (rawArrary.length == 0) {
                arr2 = addItemToArray(arr2, str);
            }
        }

        System.out.println("Remove duplicated array = " + Arrays.toString(arr2));
    }

    String[] addItemToArray(String[] arr, String item) {
        String[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = item;

        return result;
    }
}
