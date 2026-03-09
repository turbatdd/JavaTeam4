package assignment4.Prob1;

public class Electronics extends Product {

    private int warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        if (warranty < 0) {
            throw new IllegalArgumentException("Warranty cannot be negative");
        }

        if (warrantyCost < 0) {
            throw new IllegalArgumentException("Warranty cost cannot be negative");
        }

        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return (super.getPrice() + warrantyCost);
    }

    @Override
    public String toString() {
        return String.format("""
                Product name: %s
                Price: %.2f
                Warranty: %d
                Warranty cost: %.2f
                The price: %.2f
                """, super.getPrice(), super.getPrice(), warranty, warrantyCost, getPrice());

    }
}