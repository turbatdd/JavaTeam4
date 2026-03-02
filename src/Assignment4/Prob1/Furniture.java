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
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Material: ");
        sb.append(material.toString());
        sb.append("\nShipping cost: ");
        sb.append(shippingCost);
        sb.append("\nThe Price: ");
        sb.append(this.getPrice());
        sb.append("\n");

        return sb.toString();
    }
}
