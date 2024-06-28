package homework4exercise3;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Consumer<Double> payPal = amount -> {
            String string = String.format("Paying amount: " + amount + "€, with Paypal");
            System.out.println(string);
        };
        Consumer<Double> creditCard = amount -> {
            String string = String.format("Paying amount: " + amount + "€, with CreditCard");
            System.out.println(string);
        };


        //Simulate adding something to the cart
        shoppingCart.setAmount(2.30);

        //Use lambda expressions for checkout
        shoppingCart.checkout(payPal);

        shoppingCart.checkout(creditCard);

    }
}
