package Assignment1;

import java.util.Scanner;

public class Prog4 {
    void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option A/B");

        String aOrB = sc.next().toString().toUpperCase();
        System.out.println("Enter your n");
        int n = sc.nextInt();

        while (true) {
            if (n <= 0) {
                System.out.println("You entered negative number");
                break;
            }
            double result = 0.0;
            int counter = 1;
            int sign = 1;

            if (aOrB.equals("B"))
                counter = 2;

//            1/2 - 2/4 + 3/8 – 4/16 + 5/32

            for (int i = 1; i <= n; i++) {
                double r = 1.0;

                if (aOrB.equals("A")) {
                    r = 1.0 / counter;
                    result = result + (sign * r);
                    sign = sign * -1;
                    counter += 2;
                } else {
                    r = (float) i / counter;
                    result = result + (sign * r);
                    sign = sign * -1;
                    counter = counter * 2;
                }

                System.out.println(r);
            }

            System.out.printf("\nthe Result is = %.3f", result);
            break;

        }
    }
}
