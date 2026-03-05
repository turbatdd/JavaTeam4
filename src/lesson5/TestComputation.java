package lesson5;

public class TestComputation implements Computation {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public double add(double d1, double d2) {
        return d1 + d2;
    }

    void main() {
//        Computation c = new Computation();  Could not create object

        // You can declare as an Interface Type
        Computation com = new TestComputation();

        //Interface field is Static, call Interfacename.field
        System.out.println("COMPUTE INTERFACE INTEREST IS: " + Computation.INTEREST);

        // Invoke the methods
        int res1 = com.add(12, 20);
        System.out.println("Result = " + res1);

        res1 = com.add(15, 30);
        System.out.println("Result = " + res1);
        System.out.println("Sum of double = " + com.add(20.0, 22.0));

        String str1 = com.concat("eee", "yooo");
        String str2 = com.concat("eee", "yooo", "ooo");

        System.out.println("string 1 : " + str1);
        System.out.println("string 2 : " + str2);


//        Computation.INTEREST = 5.6; ERROR You cannot ressign because interface field is final
    }

    @Override
    public String concat(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder(s1);
        sb.append(", ");
        sb.append(s2);
        sb.append(", ");
        sb.append(s3);

        return sb.toString();
    }
}