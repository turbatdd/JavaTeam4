package assignmentLesson8.prob3;

import java.util.Objects;

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    public String getOrderId() {
        return orderId;
    }

    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Double.compare(totalAmount, order.totalAmount) == 0 && Objects.equals(orderId, order.orderId) && Objects.equals(customerName, order.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerName, totalAmount);
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}
