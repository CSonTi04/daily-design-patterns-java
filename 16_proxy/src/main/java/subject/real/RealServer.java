package subject.real;

import subject.Server;
/**
 * Real subject participant which the proxy can stand in for
 */
public class RealServer implements Server {
    private String order;
    @Override
    public void takeOrder(String order) {
        System.out.println("Order: " + order);
        this.order = order;
    }

    @Override
    public String deliverOrder() {
        return this.order;
    }

    @Override
    public void processPayment(String payment) {
        System.out.println("Payment for order (" + payment + ") processed.");
    }
}
