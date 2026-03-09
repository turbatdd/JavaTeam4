package lesson6.test;

import java.util.Arrays;

public class MainEmployee {
    // Inheritance Example
    public static void main(String[] args) {
        Manager boss = new Manager("Boss Guy", 80000, 2009, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];

        staff[0] = boss; // Manager Instance
        staff[1] = new Employee("Jimbo", 50000, 2012, 10, 1);
        staff[2] = new Employee("Tommy", 100, 2013, 3, 15);

        staff[2].raiseSalary(50);

        // print names and salaries
        for (Employee e : staff) {
            System.out.println(
                    "Name: " + e.getName() + "\n"
                            + "Salary:" + e.getSalary() + "\n"
                            + "Hire Day :" + e.getHireDay());
        }


        System.out.println("Count = " + getMorethan2000(staff));
    }

    /*
     Task 2: Find the count how many employees are
     getting more than 2000 salary
     */
    public static int getMorethan2000(Employee[] col) {

        Employee[] arr = Arrays.stream(col).filter(r -> r.getSalary() > 2000).toArray(Employee[]::new);

        return arr.length;
    }
}
