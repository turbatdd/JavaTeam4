import java.util.Scanner;

public class Prog4 {
    void main() {
        //a) 1 – 1/3 + 1/5 – 1/7 + 1/9
        //• Term 1: 1/1 = 1
        //• Term 2: -1/3
        //• Term 3: 1/5
        //• Term 4: -1/7
        //• Term 5: 1/9
        //Output: Sum = 0.832

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your n");
        int n = sc.nextInt();
        float result = 0;

//        while (true) {
        if (n <= 0) {
            System.out.println("You entered negative number");
//            break;
        }

//            float theF = (1 –1 / 3 + 1 / 5 –1 / 7 + 1 / 9);
        int counter = 1;
        double rawItem = 0.0;
        for (int i = 1; i <= n; i++) {
            counter += 2;
            rawItem = 1 / counter;

            System.out.printf("rawItem ----%.5f", rawItem);
            if (i == 1) {
                rawItem = 1;
            }
            System.out.println(rawItem);
//            System.out.printf("\nresult " + rawItem);

            result += rawItem;
        }

        System.out.printf("\nthe Result is = %.2f", result);
//            break;

//        }
    }
}
