package Lesson6;

public class MemberClass1 {

    private int num = 50;
    private int x = 30;
    static String s = "Turuu";


    public void display() {
        MemberClass1Inner.smethod();

    }

    static class MemberClass1Inner {
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
}
