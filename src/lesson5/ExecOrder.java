package lesson5;

class ExecOrder {

    // Static variable
    static String staticVarParent = initStaticVar();

    // Instance variable
    String instanceVarParent = initInstanceVar();

    // Static block
    static {
        System.out.println("Parent Static Block");
    }

    // Instance block
    {
        System.out.println("Parent Instance Block");
    }

    // Constructor
    ExecOrder() {
        System.out.println("Parent Constructor");
    }

    // Static method
    static String initStaticVar() {
        System.out.println("Parent Static Variable Initialized");
        return "Parent Static Var";
    }

    // Instance method
    String initInstanceVar() {
        System.out.println("Parent Instance Variable Initialized");
        return "Parent Instance Var";
    }
}


class ExecOrderChild extends ExecOrder {

    // Static variable
    static String staticVarChild = initStaticVar();

    // Instance variable
    String instanceVarChild = initInstanceVar();

    // Static block
    static {
        System.out.println("Child Static Block");
    }

    // Instance block
    {
        System.out.println("Child Instance Block");
    }

    // Constructor
    ExecOrderChild() {
        System.out.println("Child Constructor");
    }

    // Static method
    static String initStaticVar() {
        System.out.println("Child Static Variable Initialized");
        return "Child Static Var";
    }

    // Instance method
    String initInstanceVar() {
        System.out.println("Child Instance Variable Initialized");
        return "Child Instance Var";
    }
}

class ExecOrderTest {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecOrderChild c = new ExecOrderChild();
        System.out.println("Main method ends");
    }

}

