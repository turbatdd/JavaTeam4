package Assignment2.Prob4;

public class Pizza {

    private final PizzaSize pizzaSize;
    private final PizzaType pizzaType;
    private final int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {

        double choosenPizza = switch (pizzaSize) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        choosenPizza += switch (pizzaType) {
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2.0;
            case CHEEZE -> 1.5;
            case BBQCHICKEN -> 2.0;
        };

        price = choosenPizza * quantity;
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
