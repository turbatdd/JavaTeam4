package Lesson5;

public class Employee {
    private String name;
    private double salary;

    Employee() {
        name = "";
        salary = 0.0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
