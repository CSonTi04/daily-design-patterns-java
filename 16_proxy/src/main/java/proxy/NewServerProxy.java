package proxy;

import subject.Server;
import subject.real.RealServer;

/**
 * Proxy participant
 */
public class NewServerProxy implements Server {
    private String order;
    private final Server server = new RealServer();

    @Override
    public void takeOrder(String order) {
        System.out.println("New trainee server taking order for " + order + ".");
        this.order = order;
    }

    @Override
    public String deliverOrder() {
        return order;
    }

    @Override
    public void processPayment(String payment) {
        System.out.println("New trainer cannot process payments yet!");
        server.processPayment(payment);
    }
}
