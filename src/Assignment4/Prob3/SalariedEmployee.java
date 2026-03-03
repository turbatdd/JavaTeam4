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
        return String.format("""
                Firstname: %s
                Lastname: %s
                Social security number: %s
                Weekly salary: %.2f
                Payment: %.2f \n
                """, getFirsName(), getLastName(), getSocialSecurityNumber(), weeklySalary, getPayment());
    }
}
