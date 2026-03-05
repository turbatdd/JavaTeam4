package Lesson6;

 /*
Local Inner Class – Syntax and Rules
    1️⃣ Syntax
        A Local Inner Class is declared inside a method of another class.
        Conceptual structure:

            class OuterClass {
                void someMethod() {
                    class LocalInner {
                        // fields and methods
                    }
                    LocalInner obj = new LocalInner();
                }
            }

        Key point:
            The class is defined and used inside the same method.

    2️⃣ Rules of Local Inner Class

        Rule 1: Declared inside a method or block
            A local inner class must be inside a method, constructor, or block.

        Example structure:

            class Outer {
                void method() {
                    class LocalInner { }
                }
            }

        Rule 2: Scope is limited to that method
            The class cannot be accessed outside the method where it is declared.

        So this is not allowed:
            LocalInner obj = new LocalInner(); // outside the method ❌

        Rule 3: Can access outer class members
            A local inner class can access:
            - public members
            - protected members
            - private members
            - instance variables of the outer class.

        Rule 4: Can access local variables only if they are final or effectively final

        Example concept:

            int x = 10;   // allowed if not changed
            If the variable is modified later, it cannot be used inside the local inner class.

        Rule 5: Cannot declare static members
            Local inner classes cannot have static variables or static methods, except: static final constants.

3️⃣ Instantiation Rule

Objects of the local inner class must be created inside the same method.
Example concept:
    void method() {
        class LocalInner { }
        LocalInner obj = new LocalInner();
    }
4️⃣ Key Characteristics Summary
    Feature	Local               Inner Class
    Declared	                Inside a method
    Scope	                    Only inside that method
    Access outer members	    Yes
    Access local variables	    Only final/effectively final
    Static members	            Not allowed
    Object creation	            Inside the same method
 */


public class LocalInnerClass {

    private String s = "Hello Member";
    private int x = 20;

    void display() {
        int num = 10;  // effectively final variable
        int rawInt2 = 30;
//        static int rawInt = 30; // Not allowed
//        final static int rawInt2 = 40; //Not allowed


        class LocalInner {
            //x = 40; Not allowed HERE
            void print() {
                System.out.println("Number: " + num);
                System.out.println("Before x:" + x);
                x = x + 10;
                s = "dd";
                System.out.println(s + "--S");
                System.out.println("After x:" + x);
//                num = 30; ERROR
                System.out.println(rawInt2);
            }
        }

        LocalInner obj = new LocalInner();
        obj.print();
    }

    public static void main(String[] args) {
        LocalInnerClass l = new LocalInnerClass();
        l.display();
    }
}
