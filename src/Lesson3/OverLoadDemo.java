package Lesson3;

import Asignment2.Pizza;

import java.util.Arrays;

public class OverLoadDemo {
    // Overload methods
    int x; //Instance Variable

    public OverLoadDemo() {
        x++;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        OverLoadDemo ol = null;

        for (int i = 0; i < 10; i++) {
            ol = new OverLoadDemo();

        }

        System.out.println("Count = " + ol.getX());

    }
}

