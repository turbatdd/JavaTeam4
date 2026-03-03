package Assignment4.Prob3;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        String str = String.format("""
                GrossSales salary: %.2f
                Commission rate: %.2f%%
                Payment: %.2f
                """, grossSales, commissionRate, getPayment());

        sb.append(str);

        return sb.toString();
    }
}
