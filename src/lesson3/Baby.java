package lesson3;

import java.util.Random;

public class Baby {
    private int x = 10;

    static {
        String x = "Baby Class";
        System.out.println("1. Static Fields String x = " + x);
    }

    static {
        int rn = getNumber();
        System.out.println("2. Static Fields Integer rn" + rn);
    }

    public static int getNumber() {
        return new Random().nextInt();
    }

    private String name;
    private String gender;

    {
        System.out.println("Hearing baby crying - Happy");
    }

    public Baby() {
        System.out.println("I am excited to see my Baby");
    }

    public Baby(String name, String gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("I am happy to see " + name + " gender " + gender);
    }


    public static void main(String[] args) {
        Baby b = new Baby();
        Baby b2 = new Baby("Anand", "Male");
    }
}
