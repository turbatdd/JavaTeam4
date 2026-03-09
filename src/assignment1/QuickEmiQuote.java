package assignment1;

import java.util.random.RandomGenerator;

public class QuickEmiQuote {

    void main() {
        RandomGenerator rg = RandomGenerator.getDefault();

        int p = rg.nextInt(5000, 25000);
        int n = rg.nextInt(6, 36);
        double apr = rg.nextDouble(3.5, 11.5);

        double r = apr / 12 / 100;

        double emi = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
        long emiRound = Math.round(emi);
        int emiInt = (int) emi;
        double totPayment = (emiInt * n);
        double totInterest = (totPayment - p);

        System.out.printf("Principal: $%,d\n", p);
        System.out.printf("APR: $%.2f%%\n", apr);
        System.out.printf("Months: %d\n\n", n);

        System.out.printf("Calculated EMI: $%,.2f\n", emi);
        System.out.printf("Integer EMI: $%d\n", emiInt);
        System.out.printf("Rounded EMI: $%d\n\n", emiRound);

        System.out.printf("Total Payment: $%,.2f\n", totPayment);
        System.out.printf("Total Interest: $%,.2f\n", totInterest);
    }
}
