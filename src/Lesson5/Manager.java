package Lesson5;

public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    Manager(String name, double salary) {
//        super(name, salary);
    }


    @Override
    public double getSalary() {
        return this.getSalary() + bonus;
    }
}
