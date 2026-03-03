package Assignment4.Prob3;

import Assignment4.Prob2.*;

import java.util.Arrays;

public class Prob3Test {
    void main() {
        Employee[] arr = {
                new CommissionEmployee("Turbat", "Davaa", "1111", 2000.0, 0.10),
                new HourlyEmployee("Bat", "Dorj", "3333", 30, 8.0),
                new SalariedEmployee("Gerel", "Khand", "4444", 1400),
                new CommissionEmployee("Javkhaa", "Tsetseg", "5555", 6000.0, 0.10),
                new BasePlusCommissionEmployee("Mandah", "Bayar", "2222", 1000.0, 2000.0, 0.10),
        };

        for (Employee p : arr) {
            System.out.println(p);
        }

        double maxSal = 600.0;
        Employee[] res = findSalaryList(arr, maxSal);

        System.out.println("Finding salary max: " + maxSal + " Found = " + res.length + "\n");

        System.out.println(Arrays.toString(res));
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {
        Employee[] result = Arrays.stream(col).filter(r -> r.getPayment() < salary).toArray(Employee[]::new);

        return result;
    }
}
