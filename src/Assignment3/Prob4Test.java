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
    public void test1() {
        Prob4 p = new Prob4();
        int res = p.findMaxFromArray(new int[]{10, 22, 33, 9, 10});
        int res2 = p.findMaxFromArray(new int[]{-1, 10, 10, 9, 10});

        assertEquals(33, res);
        assertEquals(10, res2);

    }

    @Test
    public void testNegativeArr() {
        Prob4 p = new Prob4();

        int res = p.findMaxFromArray(new int[]{-1, -2, -3, -5, -10});
        assertEquals(-1, res);
    }

    @Test
    public void testZeroNum() {
        Prob4 p = new Prob4();

        int res = p.findMaxFromArray(new int[]{-1, -2, 0, -5, -10});
        assertEquals(0, res);
    }
}