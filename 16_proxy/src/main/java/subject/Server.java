package subject;

/**
 * Subject participant
 */

public interface Server {
    void takeOrder(String order);
    String deliverOrder();
    void processPayment(String payment);
}
