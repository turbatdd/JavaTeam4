package assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
        int[] arr = {10, 22, 33, 9, 10};
        int[] arr2 = {-1, 10, 10, 9, 10};

        Prob4 p = new Prob4();
        int res = p.findMaxFromArray(arr);
        int res2 = p.findMaxFromArray(arr2);

        System.out.println("Res arr: " + Arrays.toString(arr) + " result:" + res);
        assertEquals(33, res);
        System.out.println("Res arr: " + Arrays.toString(arr2) + " result:" + res2);
        assertEquals(10, res2);
    }

    @Test
    public void testNegativeArr() {
        int[] arr = {-1, -2, -3, -5, -10};
        Prob4 p = new Prob4();

        int res = p.findMaxFromArray(arr);
        System.out.println("Res arr: " + Arrays.toString(arr) + " result:" + res);

        assertEquals(-1, res);
    }

    @Test
    public void testZeroNum() {
        int[] arr = {-1, -2, 0, -5, -10};

        Prob4 p = new Prob4();
        int res = p.findMaxFromArray(arr);
        System.out.println("Res arr: " + Arrays.toString(arr) + " result:" + res);

        assertEquals(0, res);
    }
}