package Assignment4.Prob1;

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
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Warranty: ");
        sb.append(warranty);
        sb.append("\nWarranty cost: ");
        sb.append(warrantyCost);
        sb.append("\nThe Price: ");
        sb.append(getPrice());
        sb.append("\n");

        return sb.toString();
    }
}