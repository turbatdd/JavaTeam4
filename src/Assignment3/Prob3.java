package Assignment3;

import java.util.Scanner;

public class Prob3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Integer input");
        int theInt = sc.nextInt();

        if (theInt < 0) {
            System.out.println("Your Integer number is negative");
            return;
        }

        boolean result = isPalindrome(theInt);
        System.out.println("Your number: " + theInt);
        System.out.println("Is it Palindrome: " + result);
    }

    public static boolean isPalindrome(int i) {
        if (i < 0)
            return false;

        if (i == findPalindrome(i, 0))
            return true;
        else
            return false;
    }

    private static int findPalindrome(int i, int rev) {
        if (i == 0) {
            return rev;
        }
        return findPalindrome(i / 10, rev * 10 + i % 10);
    }

}
