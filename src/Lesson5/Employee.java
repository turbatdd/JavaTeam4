package Lesson5;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        System.out.println("Employee detail");
        return "Employee name= " + name + "\n" + "Salary = " + salary;
    }

//    @Override
//    public boolean equals(Object ob) {
//        if (ob == null) return false;
//
//        if (this == ob) return true;
//
//        if (!(ob instanceof Employee)) return false;
//
//        Employee e = (Employee) ob;
//
//        if (this.name.equals(e.name) && this.salary = e.salary)
//            return true;
//        else
//            return false;
//
//
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

