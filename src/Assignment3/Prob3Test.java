package Assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Prob3Test {

    @Before
    public void setup() {
        System.out.println("startt");
    }


    @After
    public void end() {
        System.out.println("ENDD");
    }

    @Test
    public void testPalindrome() {
        Prob3 p = new Prob3();

        int i = 12021;
        int j = 1221;
        boolean isPal = p.isPalindrome(i);
        boolean isPal2 = p.isPalindrome(j);

        System.out.println("Number: " + i + " isPalindrome:" + isPal);
        System.out.println("Number: " + j + " isPalindrome:" + isPal2);

        assertTrue(isPal);
        assertTrue(isPal2);
        System.out.println("Test ENd");
    }

    @Test
    public void testNoPalindrome() {
        Prob3 p = new Prob3();

        int i = 1234;
        int j = 1532;

        boolean isPal = p.isPalindrome(i);
        boolean isPal2 = p.isPalindrome(j);

        System.out.println("Number: " + i + " isPalindrome:" + isPal);
        System.out.println("Number: " + j + " isPalindrome:" + isPal2);

        assertFalse(isPal);
        assertFalse(isPal2);
        System.out.println("Test ENd");
    }

    @Test
    public void testZeo() {
        Prob3 p = new Prob3();

        boolean isPal = p.isPalindrome(0);
        System.out.println("Number: " + 0 + " isPalindrome:" + isPal);

        assertFalse(isPal);
        System.out.println("Test ENd");
    }

    @Test
    public void testNegative() {
        int i = -121;
        Prob3 p = new Prob3();

        boolean isPal = p.isPalindrome(-i);

        System.out.println("Number: " + i + " isPalindrome:" + isPal);


        assertFalse(Prob3.isPalindrome(-121));
    }


}