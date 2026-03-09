package lesson6;

 /*
    Member Inner Class (Easy Version)
    2️⃣ Main Rules (Easy)
    Rule 1
        It is inside another class.
    Rule 2
        It needs an outer object to create it.
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    Rule 3
        It can access all outer class variables, even private ones.
    Rule 4
        It cannot have static methods or static variables (except constants).
    ✅ One-line exam answer:
    A Member Inner Class is a non-static class defined inside another class that
    requires an outer class object and can access all members of the outer class.
 */

class MyOuterClass {
    MyInnerClass inner;
    private String param;

    MyOuterClass(String param) {
        // Outer class cannot access directly the inner class
        // You need an object to access the inner class

        inner = new MyInnerClass("innerStr");
        this.param = param; // the outer class version of this
    }

    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
//String t = inner.this.innerParam; //compiler error
    }

    class MyInnerClass {
        private String innerParam;
        int i = 40;

        MyInnerClass(String innerParam) {
//the inner class version of 'this'
            this.innerParam = innerParam;
        }

        void innerMethod() {
//accessing enclosing class’s version of this
            System.out.println(MyOuterClass.this.param);
            i = i +20;
//same as the following
            System.out.println(param);
        }
    }

    public static void main(String[] args) {
        (new MyOuterClass("outerStr")).outerMethod();
    }
}
