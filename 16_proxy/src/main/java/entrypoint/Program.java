package entrypoint;

import proxy.NewServerProxy;

public class Program {
    public static void main(String[] args) {
        var proxy = new NewServerProxy();
        System.out.println("What would you like to order?");
        var order = System.console().readLine();
        proxy.takeOrder(order);
        System.out.println("Sure thing! Here's your order: " + proxy.deliverOrder() + ".");
        System.out.println("How would you like to pay?");
        var payment = System.console().readLine();
        proxy.processPayment(payment);
    }
}
