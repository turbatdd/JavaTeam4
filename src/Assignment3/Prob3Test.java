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

        boolean isPal = p.isPalindrome(12021);
        boolean isPal2 = p.isPalindrome(1221);

        assertTrue(isPal);
        assertTrue(isPal2);
        System.out.println("Test ENd");
    }

    @Test
    public void testNoPalindrome() {
        Prob3 p = new Prob3();

        boolean isPal = p.isPalindrome(1234);
        boolean isPal2 = p.isPalindrome(1532);

        assertFalse(isPal);
        assertFalse(isPal2);
        System.out.println("Test ENd");
    }

    @Test
    public void testZeo() {
        Prob3 p = new Prob3();

        boolean isPal = p.isPalindrome(0);
//        assertEquals(true,isPal);
        assertFalse(isPal);
        System.out.println("Test ENd");
    }

    @Test
    public void testNegative() {
        assertFalse(Prob3.isPalindrome(-121));
    }


}