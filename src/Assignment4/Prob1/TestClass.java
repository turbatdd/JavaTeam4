package Assignment4.Prob1;

public class TestClass {
    void main() {

        Product[] arr = {
                new Product("Sox", 50),
                new Clothing("Shirt", 100.0, "Nike", 20.0),
                new Furniture("Table", 150.0, Material.WOOD, 10.0),
                new Furniture("Chair", 400.0, Material.WOOD, 5.0),
                new Electronics("iPhone", 500.0, 12, 50.0),
        };

        for (Product p : arr) {
            System.out.println(p.getClass().getSimpleName() + " class\n" + p.toString());
        }

        System.out.println("Total products price: " + sumProducts(arr));
    }

    public static double sumProducts(Product[] col) {
        double sumTotal = 0.0;

        if (col == null || col.length == 0)
            return sumTotal;

        for (Product p : col) {
            if (p != null)
                sumTotal += p.getPrice();
        }
        return sumTotal;
    }
}
