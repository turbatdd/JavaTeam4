package Assignment4.Prob3;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

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
        StringBuilder sb = new StringBuilder(super.toString());

        String str = String.format("""
                Wage: %.2f
                hours: %.2f%%
                Payment: %.2f
                """, wage, hours, getPayment());

        sb.append(str);

        return sb.toString();
    }
}
