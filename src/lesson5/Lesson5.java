package lesson5;

/*

1. Inheritance
    1, IS-A Relationship:
    A subclass must be a specialized form of the superclass.

    Example
    class Animal {
        void makeSound() {
            System.out.println("Animal makes sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    Dog IS-A Animal

    2. LSP (Liskov Substitution Principle):
    subclass object should be usable anywhere the superclass object is expected without breaking the program.

    Example that Follows LSP
    class Bird {
        void move() {
            System.out.println("Bird moves");
        }
    }

    class Sparrow extends Bird {
        void move() {
            System.out.println("Sparrow flies");
        }
    }

    Preventing/restricting inheritance

    1. Using the final Class (Completely Prevent Inheritance)
        If a class is declared final, it cannot be extended by any other class.

        final class Animal {
            void makeSound() {
                System.out.println("Animal sound");
            }
        }

        class Dog extends Animal {   // ❌ Compile-time error
        }

    2. Using final Methods (Prevent Method Overriding)
        A method declared final cannot be overridden in subclasses.

        class Animal {
            final void eat() {
                System.out.println("Animal eats food");
            }
        }

        class Dog extends Animal {
            // void eat() { }   ❌ Error – cannot override final method
        }

     3. Using private Constructors (Prevent Inheritance)
        If a class constructor is private, other classes cannot extend it because they cannot call the constructor.

         class Utility {
            private Utility() { }
        }

     4. Using sealed Classes (Restrict Which Classes Can Inherit) (Java 17+)
        A sealed class allows only specific classes to extend it.

        public sealed class Shape permits Circle, Rectangle {
        }

        final class Circle extends Shape {
        }

        final class Rectangle extends Shape {
        }

Rules for Subclass Constructors

    a subclass constructor must make use of one of the constructors from its superclass

    class Employee{
        Employee(String name, double salary, int y, int m, int d){
            //…//
        }
    }

    class Manager extends Employee {
            Manager(String name, double salary, int y, int m, int d) {
            super(name,salary,y,m,d); //makes use of superclass constructor
        }
    }

    If Parent class have a constructor init then child does not need constructor Init
    If Parent and child are doesn't have constructor then it's ok


    Constructor allowsness
        Allowed Before super()
             Logging / printing
             Local variable declarations
             Argument validation
             Throwing exceptions
        NOT Allowed Before super()
             Accessing instance variables
             Calling instance methods
             Using this reference


2. ABSTRACT

    1️⃣ Abstract class cannot be instantiated
        This is NOT allowed:
        Shape s = new Shape("Red"); // ERROR
        Because Shape is abstract.

    2️⃣ Abstract method has no body
        abstract double computeArea();
        It only declares the method.

    3️⃣ If a class has an abstract method → the class must be Abstract.
        Abstract class Shape

    4️⃣ Subclass must implement abstract methods
        Both subclasses implement:
        double computeArea()

    5️⃣ Different subclasses implement the service differently
        computeArea() works differently:

        Circle:
        π * r²

        Rectangle:
        length * width

        This is polymorphism.

    6️⃣ Abstract classes can contain normal methods and variables

        Example:
        String color;
        void displayColor()

    These are not abstract.


3. INTERFACE

    An interface in Java is a reference type that defines a set of methods that a class must implement.
    It specifies what a class should do, but not how it does it.

    In object-oriented design, interfaces help achieve abstraction and polymorphism and provide a safe alternative to multiple inheritance.

    1. How to Create an Interface
        Syntax
        interface InterfaceName {
            method1();
            method2();
        }

        Key idea:
        An interface only declares methods. The implementing class provides the method body.

        Example Interface
        interface Shape {
            double computeArea();
        }

        This interface declares a service: computing the area.

    2. How to Use an Interface

        A class uses an interface with the implements keyword.

        Example
        class Circle implements Shape {
            double radius;
            Circle(double r) {
                radius = r;
            }
            public double computeArea() {
                return Math.PI * radius * radius;
            }
        }

        Another class can implement the same interface:

        class Square implements Shape {
            double side;
            Square(double s) {
                side = s;
            }
            public double computeArea() {
                return side * side;
            }
        }

        Now both classes share the same interface behavior.

    3. Using the Interface (Polymorphism)
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);

        s1.computeArea();
        s2.computeArea();

        Even though the variable type is Shape, Java runs the correct method for Circle or Square.

        This demonstrates runtime polymorphism.

    4. Rules and Restrictions of Interfaces
        1. Methods are implicitly abstract
            Interface methods normally do not have a body.

            Example

            interface Animal {
                void makeSound();
            }
        2. Variables are constants
            All variables in an interface are automatically:
            public static final

            Example
            interface MathConstant {
                int MAX = 100;
            }
        3. Classes must implement all methods

            If a class implements an interface, it must implement every method.
            Otherwise, the class must be declared abstract.

        4. Interfaces cannot be instantiated

            ❌ Not allowed
            Shape s = new Shape();
            Interfaces cannot create objects.

        5. A class can implement multiple interfaces
            Java does not allow multiple inheritance of classes, but it allows multiple interfaces.
            Example
            class Robot implements Movable, Rechargeable

    5. Proper Usage of Interfaces
        Interfaces should be used when:

            1. You want multiple classes to share a common behavior
                Example

                Shape
                 ├── Circle
                 ├── Square
                 └── Triangle

                All provide computeArea().

            2. You want loose coupling
                Code depends on interface, not concrete classes.

                Example concept
                Shape shape = new Circle();
                Instead of:
                Circle shape = new Circle();
                This improves flexibility and maintainability.

            3. You want polymorphism
                Interfaces allow writing general code that works with many object types.


            Term	            Meaning	Example
            Unimplemented	    Declared, no body, abstract, must be implemented by subclass
                                abstract double computeArea();
            Implemented	        Has a body, contains executable code
                                double computeArea() { return 0.5*base*height; }


            Abstraction, implemented(private, default, protected) and unimplemented(Abstract)methods - public
            // You cannot create object for Interface.
            // Interface ca have fields. public static final
            public interface Computation {
                double INTEREST = 5.5; // This line is equivalient to public static final double INTEREST = 5.5;

                //    Methods - Unimplemented - public abstract - nobody
                public abstract int add(int x, int y);

                //    This method is also public abstract
                double add(double d1, double d2);

                //    Implement methods, default implementation(belongs to objects)
                //   or static implementation Interface level
                //   default keyword indicated providing default implementation,
                //   not access modifier default(Package visibility)

                // Only public or default
                default String concat(String s1, String s2) {
                    if (input(s1, s2))
                        return s1 + " " + s2;

                    return null;
                }

                default String concat(String s1, String s2, String s3) {
                    return s1 + " " + s2 + " " + s3;
                }

                //Inside you provide private method for internal Interface use
                private boolean input(String x, String y) {
                    return (x != null && y != null);
                }

                //Static methods - Utility methods, call using Interface.static method inside class
            }


4. OVERLOADING AND OVERRIDING

1. Method Overloading

    Definition:
        Method overloading means having multiple methods with the same name in the same class but with different parameters (different number, type, or order of parameters).

    Rules

        Methods must have the same name.
        Methods must have different parameter lists:
        Different number of parameters, or Different types of parameters, or Different order of parameters.
        Return type alone cannot differentiate overloaded methods.
        Happens within the same class (usually).

    Usage
        Used when the same operation works on different types or numbers of inputs.

    Example
    class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    Here the method add() is overloaded with different parameters.

2. Method Overriding

    Definition:
    Method overriding means a subclass provides a new implementation of a method that already exists in its superclass.

    This is part of inheritance and polymorphism.

    Rules
        Must occur between superclass and subclass.
        Method name must be the same.
        Parameters must be exactly the same.
        Return type must be same or covariant.
        Method cannot override a final method.
        Usually annotated with @Override for compiler checking.

    Usage
        Used when a subclass needs different behavior for the same method.

    Example
    class Employee {
        double getSalary() {
            return 50000;
        }
    }

    class Manager extends Employee {
        @Override
        double getSalary() {
            return 50000 + 10000; // manager gets bonus
        }
    }

    Here Manager overrides getSalary() from Employee.

3. Quick Comparison
    Feature	                Overloading	                Overriding
    Class Relationship	    Same class	                Parent & child class
    Method Name	            Same	                    Same
    Parameters	            Different	                Same
    Return Type	            Can be different	        Same or covariant
    Inheritance Required	No	                        Yes
    Runtime / Compile	    Compile-time polymorphism	Runtime polymorphism

✅ Simple way to remember

    Overloading → Same method name, different parameters.
    Overriding → Same method, but subclass changes its behavior.


4. Polymorphism

    Polymorphism is an Object-Oriented Programming (OOP) concept where one method or object can take many forms.
    It allows the same method name to behave differently depending on the object that calls it.
    In Java, polymorphism is closely related to inheritance and method overriding.

    1. Simple Definition

        Polymorphism = “One interface, many implementations.”
        This means the same method call can produce different results depending on the object type.

    2. Example
        From the course example with Employee and Manager:
            Manager is a subclass of Employee.
            Manager overrides the getSalary() method.
        Conceptually:
            Employee salary → base salary
            Manager salary → base salary + bonus
        When we call getSalary(), Java decides at runtime which version to run.

    3. Conceptual Example
        Think about an Employee array that stores different types:

        Employee[] staff

        Inside the array we can store:
            Employee objects
            Manager objects
        When calling:
            e.getSalary()

        Java automatically executes:
            Employee.getSalary() for Employee
            Manager.getSalary() for Manager

        This happens because the JVM checks the actual object type at runtime. This behavior is called dynamic binding (late binding).

    4. Types of Polymorphism in Java

        1. Compile-Time Polymorphism
            Also called Method Overloading

            Example concept:
                add(int a, int b)
                add(int a, int b, int c)
                Same method name, different parameters.

        2. Runtime Polymorphism
            Also called Method Overriding

            Example concept:
            Superclass:
                getSalary()

            Subclass overrides:
                getSalary()

            Java chooses the correct method during program execution.

        5. Real-Life Analogy
            Think of a remote control button “Power”.

            TV → turns on TV
            Fan → turns on fan
            Computer → turns on computer
            Same button name Power, but different behavior depending on the device.

    ✅ One-line exam definition (very common in CS390):

            Polymorphism is the ability of an object reference to refer to objects of different types and invoke the appropriate method at runtime.



REFLECTION

    String s = "Hello";
    Class cl = s.getClass();

    Class cl2 = String.class;
    System.out.println(cl == cl2); //true

    Class cl3 = Class.forName("java.lang.String");
    System.out.println(cl == cl3); //true

    // Return a String "java.lang.String"
    String name = "Hello".getClass().getName();
    // Return a without package name, "String"
    String name3 = "Hello".getClass().getSimpleName();


EQUALS COMPARE

SAMPLE 1
    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;

        if (this == ob) return true;

        if (!(ob instanceof Employee)) return false;

        Employee e = (Employee) ob;

        if (this.name.equals(e.name) && this.salary = e.salary)
            return true;
        else
            return false;


    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

SAMPLE 2
    @Override
    public boolean equals(Object withJob) {
        if(withJob == null) return false;
        if(withJob.getClass() != this.getClass())
        return false;
        PersonWithJob p = (PersonWithJob)withJob;
        boolean isEqual =
        getName().equals(p.getName()) &&
        this.salary == p.salary;
        return isEqual;
    }




    Employee e1 = new Employee("Turuu", 110.0);
    Employee e2 = new Manager("Bat", 200.0);
    Manager e3 = new Manager("Tur", 550.0);
    Object[] stuff = {"Java", 10.11, 11, 13.65, "Hi"};

    System.out.println(e1.getClass().getSimpleName() + "---"+e1.getSalary()); //110
    System.out.println(e2.getClass().getSimpleName() + "---"+e2.getSalary()); //200
    System.out.println(e3.getClass().getSimpleName() + "---"+e3.getSalary()); //550


    public class Student { ... }
    public class Undergraduate extends Student { ... }
    public class Graduate extends Student { ... }
    Student st1, st2, st3;
    Graduate st4;
    st1 = new Student();
    st2 = new Undergraduate();
    st3 = new Graduate();
    st4 = new Student(); //compiler error


Employee em1 = new Employee ()  // Runtime call  Employee -s getSalary()
Employee em2 = new Manager()  // Runtime call getSalary()
Manager em3 =  new Manager() //
em1.getBonus() = > employee getSlaary() call
me2.getBonus() = > Manaerer getSalary() call cant access only Employees method
em3.getBonus() => can Access
Donw casting - is em2.setBonus(600) convert to Employee to Manager  = ((Manager) e2).setBonus(600)

Employee[] arr = {em1, em2, em3};

for(Employee e:arr){
 soutp(e.getName())
soutp(e.getSalary());
}


 */
public class Lesson5 {
}
