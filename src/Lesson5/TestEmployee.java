package Lesson5;

public class TestEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee("Turuur", 100000.0);
        Employee e2 = new Employee("Turuur", 100000.0);
        Employee e3 = new Employee("Bat", 100000.0);

        System.out.println(e1);
        System.out.println(e2.toString());

        System.out.println(e1.equals(e2));
    }
}
