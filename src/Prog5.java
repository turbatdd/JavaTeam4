import java.util.Scanner;

public class Prog5 {
    void main() {

        int[] arr = {22, 20, 45, 23, 33, 44, 11, 22, 17};

        int maxNum = 0;
        int oldMax = 0;

        for (int r : arr) {
            if (r > maxNum) maxNum = r;
            if (maxNum > r && oldMax < r) oldMax = r;
        }

        System.out.println("max1 = " + maxNum);
        System.out.println("max2 = " + oldMax);
    }
}
