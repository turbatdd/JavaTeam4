package Assignment3;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String input");
        String str = sc.nextLine();

        if (str == null || str.isEmpty()) {
            System.out.println("String null");
            return;
        }

        if (!isStingValid(str)) {
            System.out.println("String has a number. Invalid String input");
            return;
        }

        char c = findMinChar(str);
        System.out.println("Minimum character is: " + c);
    }

    public static char findMinChar(String str) {
        if ( str == null || str.isEmpty()){
//            System.out.println("ENDD LENGTH");
            return Character.MAX_VALUE;
        }

        char rawC = findMinChar(str.substring(1));

//        System.out.println("character---" + rawC + " int---" + (int) rawC);
//        System.out.println("character---" + str.charAt(0) + " int---" + (int) str.charAt(0));

        if (str.charAt(0) < rawC)
            return str.charAt(0);
        else
            return rawC;
    }

    public static boolean isStingValid(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                return false;
        }

        return true;
    }

}
