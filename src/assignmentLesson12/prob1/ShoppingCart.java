package assignmentLesson12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = 0;

        while (true) {
            try {
                System.out.println("Enter your quantity/Between 1 to 50/");

                quantity = sc.nextInt();

                if (quantity < 1 || quantity > 50)
                    throw new IllegalArgumentException("Quantity entered is less than 1 or greater than 50");
                else
                    break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Input is not a number");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Enter quantity of items to add (1-50): ");
        System.out.println("Successfully added " + quantity + " items to your cart!");
    }
}