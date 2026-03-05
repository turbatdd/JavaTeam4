package Lesson4;

import java.util.Arrays;

public class Recursive {
    public static void main(String[] args) {

//        int count = length("Bataa");
//        System.out.println("Count: " + count);

//        printCharsReverse("asdoepp");

//        int resF = fact(4);

//        System.out.println(12399/10);
//        System.out.println(12399%10);
//
//        reverseDigit(12388);

//        findMinChar("asqffso);

//        int f = fib(5);
//        System.out.println("fibonaci num:" + f);


//        reversedArray(new int[]{1, 3, 5, 7, 9, 13});

//        boolean result = isPalindrome(12321);


//        int[] arr = {5, -3, 6, 70, 9, 4};
//
//        int maxVal = findMaxFromArray(arr);
//
//        System.out.println("Your array: " + Arrays.toString(arr));
//        System.out.println("Max value is: " + maxVal);


        System.out.println("Sum = " + Sum(4));
    }

    public static int length(String str) {
        if (str == null || str.equals(""))// base case
            return 0;
        else // Recursive case
        {
            int res = 1 + length(str.substring(1));
            System.out.println("res:" + res);
            return res;
        }
    }

    public static void printCharsReverse(String str) {
        if (str == null || str.equals(""))
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    public static int fact(int num) {
        if (num == 0 || num == 1) { //base case
            return 1;
        }
        System.out.println("Num: " + num);
        int f = fact(num - 1);
        int res = f * num;

        System.out.println("ff: " + f + "    num: " + num + "   res: " + res);

        return res;
    }

    public static void reverseDigit(int n) {
        if (n > 0) {
            System.out.print(n % 10);
//            System.out.println(n / 10);
            reverseDigit(n / 10);
        }
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

//        F0 = 0, F1 = 1, F2 = 1, F3 = 2, F4 = 3, F5 = 5,…,
//        OR
//        F0 = 0, F1 = 1, Fn = Fn-1 + Fn-2
//        for n > 1

        return fib(n - 1) + fib(n - 2);
    }

    public static char findMinChar(String str) {
        if (str == null || str.isEmpty()) {
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

    private static void reverseArrayByIndex(int[] arr, int[] revArr, int idx) {
        if (idx == arr.length) {
            return;
        }
        revArr[idx] = arr[arr.length - 1 - idx];
        System.out.println(revArr[idx]);

        reverseArrayByIndex(arr, revArr, idx + 1);
    }

    public static int[] reversedArray(int[] arr) {
        int[] revArr = new int[arr.length];
        reverseArrayByIndex(arr, revArr, 0);
        return revArr;
    }

    public static boolean isPalindrome(int i) {
        if (i <= 0)
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

    public static int findMaxFromArray(int[] arr) {
        return findMaxValue(arr, 0);
    }

    private static int findMaxValue(int[] arr, int idx) {
        if (arr == null) {
            return Integer.MAX_VALUE;
        }

        if (idx == arr.length - 1)
            return arr[idx];

        int maxInRest = findMaxValue(arr, idx + 1);

        if (maxInRest > arr[idx]) {
            return maxInRest;
        } else {
            return arr[idx];
        }
    }

    public static int Sum(int n) {
        if (n == 1)            //base case
            return 1;
        else
            return Sum(n - 1) + n; //general case
    }
}
