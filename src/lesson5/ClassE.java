package lesson5;

// Class E - Super class / Parent
public class ClassE {
    // Static field
    static int superInt = superIntMethod();

    static int superIntMethod() {
        System.out.println("1-Initializing static super int");
        return 1;
    }

    // Ststic block
    static {
        System.out.println("2-Executing super static block");
    }

    // Instance method - non static method
    int superInstanceIntMethod() {
        System.out.println("5-Initialzing superInstanceInt");
        return 3;
    }
    // instance fields

    private int superInstanceInt = superInstanceIntMethod();

    // Constructor
    ClassE() {
        System.out.println("7-Running ClassE constructor");
    }

    // Instance block / Object initialization block
    {
        System.out.println("6-Running super object initialization block");
    }

    public static void main(String[] args) {
        new SubClass();
        // Nothing wrong, it allocates memory for the instance, you cannot refer
    }
}

// Sub class / Child class

class SubClass extends ClassE {
    static int subInt = subIntMethod();

    static int subIntMethod() {
        System.out.println("3-Initializing static sub int");
        return 2;
    }

    static {
        System.out.println("4-Executing sub static block");
    }

    // Sub class Instance method
    int subInstanceIntMethod() {
        System.out.println("9-Initialzing subInstanceInt");
        return 3;
    }

    // Subclass Constrctor
    SubClass() {
        System.out.println("10-Running SubClass constructor");
    }

    //Sub class instance initialization block
    {
        System.out.println("8-Running sub object initialization block");
    }

    // Instancce fields
    private int subInstanceInt = subInstanceIntMethod();

}