package Assignment4.Prob1;

public class Product {
    public String productName;
    public double price;

    public Product(String productName, double price) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }

        if (price < 1) {
            throw new IllegalArgumentException("Price cannot be 0 or negative");
        }

        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("""
                Product name: %s
                Price: %.2f
                """, getProductName(), getPrice());
    }

}