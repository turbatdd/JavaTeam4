package Lesson6;


/*
    Rules of Static Nested Class
    Rule 1: Declared with static
        The nested class must be declared with the static keyword.
        static class Nested { }

    Rule 2: Does NOT need outer class object
        Object creation:
        Outer.Nested obj = new Outer.Nested();
        No outer object required.

    Rule 3: Can access only static members of outer class directly
        Allowed:
            static variables
            static methods

        Not allowed directly:
            instance variables
            instance methods
            To access instance members, an outer object is required.

    Rule 4: Can have static members
            Unlike other inner classes, static nested classes can declare static variables and methods.

5️⃣ Key Characteristics Summary
    Feature	Static Nested Class
    Declared	                        Inside class with static
    Needs outer object	                ❌ No
    Access outer instance members	    ❌ Not directly
    Access outer static members	        ✅ Yes
    Can have static methods/variables	✅ Yes

✅ One-line exam definition

A Static Nested Class is a static class defined inside another class that can access only the static members of the outer class and
does not require an outer class object for instantiation.

 */

public class StaticClass {
    private int num = 50;
    private int x = 30;
    static String s = "Turuu";

    public void display() {
        MemberClass1Inner.smethod();
    }

    public static class MemberClass1Inner {
        //Inside static class, you can include
        //Static fields/methods, instance fields/methods
        //Static method can access only static reference

        private int k = 50;
        static long l = 60l;

        public void m1() {
            System.out.println(k);
            System.out.println(l);
            System.out.println(s);
//            System.out.println(num); Non static outer not allowed inside static class
        }

        public static void smethod() {
            System.out.println(s);
//            System.out.println(k); //Non static not allowed inside static method
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
//        StaticClass ob = new StaticClass().MemberClass1Inner();
    }
}
