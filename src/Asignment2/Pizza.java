package Asignment2;

enum PizzaSize {
    SMALL, MEDIUM, LARGE
}

enum PizzaType {
    VEGGIE, PEPPERONI, CHEEZE, BBQCHICKEN
}

public class Pizza {


    private final PizzaSize pizzaSize;
    private final PizzaType pizzaType;
    private final int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = calculatePrice(); // calculated internally
    }

    private double calculatePrice() {
        double rawPrice = 0.0;

        switch (pizzaSize) {
            case SMALL -> rawPrice = 8.0;
            case MEDIUM -> rawPrice = 10.0;
            case LARGE -> rawPrice = 12.0;
        }

        switch (pizzaType) {
            case VEGGIE -> rawPrice += 1;
            case PEPPERONI -> rawPrice += 2;
            case CHEEZE -> rawPrice += 1.5;
            case BBQCHICKEN -> rawPrice += 2;
        }

        return rawPrice * quantity;
    }

    public String printOrderSummary() {
        double taxPrice = price * 0.03;
        return String.format(
                """
                        Pizza Order:
                        Size: %s
                        Type: %s
                        Qty: %d
                        Price: $%.2f
                        Tax: $%.2f
                        Total Price: $%.2f
                        """, pizzaSize, pizzaType, quantity, price, taxPrice, price + taxPrice);
    }
}
