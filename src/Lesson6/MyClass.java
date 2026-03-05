package Lesson6;

// MyClass.class - Byte code
public class MyClass {
    private String s = "outer"; // Outer class member
    private int x = 20;
    static private String ab = "Hello";

    public MyClass() {
        // Outer class cannot access directly the inner class
        // You need an object to access the inner class
        MyInner ob = new MyInner();
        // System.out.println(ob.inner);
        ob.display();
        // Using Static Inner class
        System.out.println(MyStatic.a1);
        // Non-static field
        MyStatic ob1 = new MyStatic();
        ob1.m2();
    }

    // Outer class method
    public void omethod(int data) { // By default data is final
//        inside local
        int loc = 56;
        loc = 200;
        class Local {
            Local() {
                System.out.println("Local");
            }

            void print() {
                final long l = 100;
                // Local class can access outer class fields
                System.out.println(s);
                System.out.println(x);
                // System.out.println("loc = " + loc);
                System.out.println("data = " + data);
                // Local variable cannot modified inside Local class
                // data = data + 100; // Assume data is effectively final
                // loc = data; // loc is assumed effectively final inside local
                // l = 200; // Cannot change the final
            }
        }
        // Outer class want to access, before method execution
        Local ob = new Local();
        ob.print();
    }

    // Inner class - To implement event Listeners/ Comparator Interface
    // MyClass.MyInner.class
    public class MyInner {
        private int inner = 50;
        private String s = "Inner";
        static private int k = 100;

        // From JDK 16, inner class can have static fields
        public MyInner() {
            // System.out.println("Inner Class");
        }

        void display() {
            // Inner class can access outer/enclosing class
            // methods and fields even private
            System.out.println(this.s); // this belongs to current
            System.out.println(inner);
            System.out.println(MyClass.this.s); // Outer class s
            System.out.println(ab);
        }
    }

    // Static Inner class
    static public class MyStatic {
        // Static class can access only static fields and methods
        // If non-static create an object of outer class and call it

        public MyStatic() {
            System.out.println("Static Inner class");
        }

        // Can have static and non-static fields and methods
        static private int a1 = 20;
        private int a2 = 30;

        public static void m1() {
            // System.out.println(s); // s is not a static
            int a3 = 50;
            MyClass outerob = new MyClass();
            System.out.println(outerob.s);
            System.out.println(ab); // ab is static
            // System.out.println(a2);
            // Static method can access only static fields
            System.out.println(a3);
        }
        // You cannot access non-static inside non-static method

        public void m2() {
            // System.out.println(s); // s is not a static
            System.out.println(a2);
            System.out.println(ab); // ab is static
        }
    }
}