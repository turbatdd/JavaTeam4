package assignment4.Prob3;

public class HourlyEmployee extends Employee {

    private final double wage;
    private final double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("""
                Firstname: %s
                Lastname: %s
                Social security number: %s
                Wage: %.2f
                hours: %.2f%%
                Payment: %.2f \n
                """, getFirsName(), getLastName(), getSocialSecurityNumber(), wage, hours, getPayment());
    }
}
