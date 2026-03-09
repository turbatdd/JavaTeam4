package lesson4;

public class Recursive {
    public static void main(String[] args) {

/*
Recursion (Lesson 4 – Recursion1.pdf )
✅ A. Base Case and Recursive Case
    - Base Case
        1. The stopping condition.
        2. Must solve the problem directly.
        3. Prevents infinite recursion.
    - Recursive Case
        1. Method calls itself.
        2. Reduces the problem size.
        3. Must move toward the base case.
✅ B. Tracing Recursive Code
    - When tracing:
        1. Identify base case.
        2. Track each recursive call.
        3. Understand stack frames (activation frames).
        4. Follow return values back up.
    - Important concepts from slides:
        1. Run-time stack
        2. Activation frames
        3. LIFO order (Last In First Out)
    💡 Tip: Always write out the recursive call chain step by step.


    Important JUnit Annotations

    When to use Iteration :
        • If memory and performance are the priority
        • Loops for mathematical operations (Factorial, Fibonacci, Prime Checking)
        • Dynamic Programming(Will discuss in Algorithms)
        • Dynamic Programming(Will discuss in Algorithms)
    When to use Recursion: (Will get knowledge in Algorithms course)
        • Natural recursion structure exists.
        • Tree Traversals (Binary Trees, Graph DFS)
        • Divide & Conquer Algorithms (Merge Sort, Quick Sort, etc.,)
        • Combinatorial Problems (Backtracking, N-Queens)

    Annotation       Description
    @Test            Marks a method as a test case.
    @BeforeEach      Runs before each test case. Used for setup.
    @AfterEach       Runs after each test case. Used for cleanup.
    @BeforeAll       Runs once before all tests (static method).
    @AfterAll        Runs once after all tests (static method).
    @Disabled        Skips a test case temporarily.

    Assertion Methods
    Method                           Purpose
    assertEquals(expected, actual)   Checks if values are equal.
    assertTrue(condition)            Passes if the condition is true.
    assertFalse(condition)           Passes if the condition is false.
    assertNotNull(object)            Ensures the object is not null.
*/

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


//        System.out.println("Sum = " + Sum(4));

        System.out.println("Factorial: " + factorial(6));
        System.out.println("Fact:" + fact(6));
    }

    public static int factorial(int i) {
        if (i == 1) {
            return 1;
        }

        return i * factorial(i - 1);
    }

    public static int length(String str) {
        if (str == null || str.equals(""))// base case
            return 0;
        else // Recursive case
        {
            System.out.println("res:" + str);

            int res = 1 + length(str.substring(1));
            System.out.println("res:" + res);
            return res;
        }
    }

    public static void printCharsReverse(String str) {
        System.out.println("str = " + str);
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
