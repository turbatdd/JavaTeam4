package assignment4.Prob3;

public class CommissionEmployee extends Employee {

    private final double grossSales;
    private final double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("""
                Firstname: %s
                Lastname: %s
                Social security number: %s
                GrossSales salary: %.2f
                Commission rate: %.2f%%
                Payment: %.2f \n
                """, getFirsName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), commissionRate, getPayment());
    }
}
