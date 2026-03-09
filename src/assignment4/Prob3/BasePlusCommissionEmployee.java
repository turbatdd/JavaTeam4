package assignment4.Prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private final double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString() {
        return String.format("""
                Firstname: %s
                Lastname: %s
                Social security number: %s
                GrossSales salary: %.2f
                Commission rate: %.2f%%
                Base Salary: %.2f
                Payment: %.2f \n
                """, getFirsName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), baseSalary, getPayment());
    }
}
