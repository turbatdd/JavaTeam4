package Lesson5;

public class Main {

    void main() {
        Employee e1 = new Employee("Turuu", 110.0);
//        Employee e2 = new Manager("Bat", 200.0);
//        Manager e3 = new Manager("Tur", 550.0);
        Object[] stuff = {"Java", 10.11, 11, 13.65, "Hi"};

//        System.out.println(e1.getClass().getSimpleName());

    }

//    Lesson 5
//
//    Inherents - Use keyword extends
//    Public class C1{
//
//    }
//    Overrite method check Private Protected;
//    Public class C3 extends C1{}
//
//    Atleast 1 constructor call of extended class
//
//    If base class could not create any default constructor its going to fine
//
// Test call any constrcatror
//
//- no constructor - 2 contractor  - call C1 Constractor
//
// Super call test
// Override method call example
//
//    @Override
//    double getSalary(){
//        return  super.getSalary() + bonus;
//    }

//    Employee em1 = new Employee ()  // Runtime call  Employee -s getSalary()
//    Employee em2 = new Manager()  // Runtime call getSalary()
//    Manager em3 =  new Manager() //
//    em1.getBonus() = > employee getSlaary() call
//    me2.getBonus() = > Manaerer getSalary() call cant access only Employees method
//    em3.getBonus() => can Access
//    Donw casting - is em2.setBonus(600) convert to Employee to Manager  = ((Manager) e2).setBonus(600)

//    Employee[] arr = {em1, em2, em3};
//
//    for(Employee e:arr){
//     soutp(e.getName())
//    soutp(e.getSalary());
//    }


//    Default protected same rule as Package
//    Default variable only can asses as Package
//    if have a Inherent so can access protected value (pack are difference is no problem)


    // switch case automatitcaly check instance of Class parent or base class check
    // What is the LSP?

    // Final method override not working beacause it is final
    // Multiple inherantance not support on Java

    // ABSTRACTT CLASS

    // If class is Abstract  -Abstract class cannot create object   like = new Fater()  could not
    // You can declare as a Parameter
    // HAS Implement and unimplement methos
    // abstract class Father{}
    // public void m1(){} -> Implement method
    // abstract public double getAbstract() -> Unimplement method , You should provide implementation in child class only and noBody
    // IN child class @override public double getAbstract(){}
    // new Emp() error check but works fine at employee [] er = {new Emp(5)};


}
