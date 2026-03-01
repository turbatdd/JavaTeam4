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

        boolean isPal = p.isPalindrome(12020);
        boolean isPal2 = p.isPalindrome(1221);

//        assertEquals(true,isPal);
        assertEquals(true, isPal2);
        System.out.println("Test ENd");
    }

}