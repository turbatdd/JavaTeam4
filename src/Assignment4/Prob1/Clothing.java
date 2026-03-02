package Assignment4.Prob1;

public class Clothing extends Product {

    private String brand;
    private double discountValue;

    public Clothing(String productName, double price, String brand, double discountValue) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand name cannot be null or empty");
        }

        if (discountValue < 0) {
            throw new IllegalArgumentException("DiscountValue cannot be negative");
        }

        super(productName, price);
        this.brand = brand;
        this.discountValue = discountValue;
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * (100 - discountValue)) / 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Brand: ");
        sb.append(brand);
        sb.append("\nDiscountValue: ");
        sb.append(discountValue);
        sb.append("\nThe Price: ");
        sb.append(this.getPrice());

        sb.append("\n");

        return sb.toString();
    }
}
