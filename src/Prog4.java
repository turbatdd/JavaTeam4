import java.util.Scanner;

public class Prog4 {
    void main() {
        optionA();
//        optionB();
    }

    void optionB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n");
        int n = sc.nextInt();

        while (true) {
            if (n <= 0) {
                System.out.println("You entered negative number");
                break;
            }

//            1/2 - 2/4 + 3/8 – 4/16 + 5/32
            double result = 0.0;
            int counter = 2;
            int sign = 1;

            for (int i = 1; i <= n; i++) {
                double r = (float) i / counter;
                result = result + (sign * r);
                sign = sign * -1;
                counter = counter * 2;

                System.out.println(r);
            }


            System.out.printf("\nthe Result is = %.3f", result);
            break;

        }
    }

    void optionA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n");
        int n = sc.nextInt();

        while (true) {
            if (n <= 0) {
                System.out.println("You entered negative number");
                break;
            }

//            float theF = (1 –1 / 3 + 1 / 5 –1 / 7 + 1 / 9);
            double result = 0.0;
            int counter = 1;
            int sign = 1;

            for (int i = 1; i <= n; i++) {
                double r = 1.0 / counter;
                result = result + (sign * r);
                sign = sign * -1;
                counter += 2;

                System.out.println(r);
            }


            System.out.printf("\nthe Result is = %.3f", result);
            break;

        }
    }
}
