package Assignment4.Prob3;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        String str = String.format("""
                Weekly salary: %.2f
                Payment: %.2f
                """, weeklySalary, getPayment());

        sb.append(str);

        return sb.toString();
    }
}
