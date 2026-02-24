import java.lang.reflect.Array;
import java.util.Arrays;

public class Prog3 {

    void main() {
        String[] arr = new String[]{"horse", "dog", "cat", "horse", "dog"};
        String[] arr2 = new String[0];


        for (String str : arr) {
            Object[] rawArrary = Arrays.stream(arr2).filter(r -> r == str).toArray();

            if (rawArrary.length == 0) {
                arr2 = addItemToArray(arr2, str);
            }
        }

        System.out.println("array is = " + Arrays.toString(arr2));
    }

    String[] addItemToArray(String[] arr, String item) {
        String[] result = Arrays.copyOf(arr, arr.length + 1);
        result[result.length - 1] = item;

        return result;
    }
}
