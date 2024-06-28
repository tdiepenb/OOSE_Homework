package homework4exercise3;

import java.util.function.Consumer;

public class ShoppingCart {
    private double amount;

    public ShoppingCart() {
        this.amount = .0;
    }

    public ShoppingCart(double amount) {
        this.amount = amount;
    }

    public void checkout(Consumer<Double> paymentStrategy) {
        System.out.println("Checkout started");
        paymentStrategy.accept(this.amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



}
