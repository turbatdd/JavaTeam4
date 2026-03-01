package Assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Prob4Test {

    @Before
    public void setup() {
        System.out.println("startt");
    }


    @After
    public void end() {
        System.out.println("ENDD");
    }


    @Test
    public void test4() {
        Prob4 p = new Prob4();

        int maxVal = p.findMaxFromArray(new int[]{10, 22, 33, 9, 10});
        assertEquals(33, maxVal);
    }
    @Test
    public void test41() {
        Prob4 p = new Prob4();

        int maxVal = p.findMaxFromArray(new int[]{10, 22, 33, 9, 10});
        assertEquals(22, maxVal);
    }
}