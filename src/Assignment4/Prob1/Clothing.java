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
        return String.format("""
                Product name: %s
                Price: %.2f
                Brand: %s
                Discount Value: %.2f
                The price: %.2f
                """, super.getProductName(), super.getPrice(), brand, discountValue, getPrice());
    }
}
