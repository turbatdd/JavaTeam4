package lesson6.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear, aMonth, aDay);
    }

    // instance methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDay() {
        final String DATE_PATTERN = "MM/dd/yyyy";

        return hireDay.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    /* Task 1: Implement this function to raise the employee salary */
    public void raiseSalary(double byPercent) {
//        50%
        salary = salary + (salary * byPercent / 100);
    }
}
