package Assignment4.Prob1;

public class Furniture extends Product {
    private Material material;
    private double shippingCost;

    public Furniture(String productName, double price, Material material, double shippingCost) {
        if (material == null) {
            throw new IllegalArgumentException("Material cannot be negative");
        }

        if (shippingCost < 0) {
            throw new IllegalArgumentException("ShippingCost cost cannot be negative");
        }

        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return (super.getPrice() + shippingCost);
    }

    @Override
    public String toString() {
        return String.format("""
                Product name: %s
                Price: %.2f
                Material: %s
                Shipping cost: %.2f
                The price: %.2f
                """, super.getProductName(), super.getPrice(), material.toString(), shippingCost, getPrice());
    }
}
