package lesson6;


/*
An Anonymous Inner Class is a class without a name that is declared and instantiated in one step.
It is usually used to implement an interface or extend a class for one-time use.

4️⃣ Rules of Anonymous Inner Class
    Rule 1: No class name
        The class is anonymous (unnamed).

    Rule 2: Declared and instantiated together
        Definition and object creation happen in one statement.

    Rule 3: Used for one-time object creation
        Usually used when:
            - You need a single implementation
            - The class will not be reused

    Rule 4: Can access outer class members
        Anonymous inner classes can access:
            - outer class variables
            - outer class methods
            - private members

    Rule 5: Can access local variables only if they are final or effectively final
        Example concept:
            int x = 5;   // allowed if not changed

    Rule 6: Cannot declare constructors
        Because the class has no name.


5️⃣ Key Characteristics Summary
    Feature	Anonymous       Inner Class
    Class name	            None
    Declared	            Inside expression
    Object creation	        Same statement
    Access outer members	Yes
    Access local variables	Only final/effectively final
    Constructors	        Not allowed



✅ Advantages of Anonymous Inner Classes

    1. Concise Code
        No need to write a separate class file or class declaration.
        Helps keep the code short when the class is used only once.
    2. One-Time Implementation
        Useful for providing single-use implementations of interfaces or classes.
        Ideal for event handling or callbacks in GUIs.
    3. Direct Access to Outer Class Members
        Can access outer class variables and methods, including private members.
        Useful for modifying or using outer class state directly.
    4. Improves Readability
        Keeps the implementation close to the point of use.
        Makes the relationship between the object and its behavior clear.
    5. No Name Needed
        Since the class is unnamed, you don’t have to worry about naming conflicts.
    6. Encapsulation of Behavior
        Limits the scope of the class to a single use.
        Prevents the class from being reused elsewhere unnecessarily.

Disadvantages of Anonymous Inner class

    1️⃣ Cannot Have a Constructor
        Anonymous classes have no name, so you cannot define a constructor.
        Initialization must be done in instance initializer blocks or via outer constructor parameters.
    2️⃣ Hard to Reuse
        Since the class has no name, it cannot be reused elsewhere in the program.
        You must write a new anonymous class each time you need it.
    3️⃣ Harder to Read and Debug
        Large anonymous classes can make code less readable.
        Stack traces can be harder to interpret because the class has no descriptive name.
    4️⃣ Limited Scope
        They can only access:
            Outer class members
            Local variables that are final or effectively final
            Cannot declare static members (except constants).
    5️⃣ Only One Object Instance
        An anonymous inner class is typically used for a single object.
        If multiple objects with the same behavior are needed, the code must be duplicated.

One-line exam definition

An Anonymous Inner Class is an unnamed class declared and instantiated in a single statement,
usually used for one-time implementation of an interface or class.

 */
interface Greeting {
    void sayHello();
}

class AnonymClass {
    public static void main(String[] args) {

        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        g.sayHello();
    }
}