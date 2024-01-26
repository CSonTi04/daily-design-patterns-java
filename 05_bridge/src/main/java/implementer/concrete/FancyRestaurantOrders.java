package implementer.concrete;

import implementer.OrderingSystem;
/**
 * Concrete Implementer participant, implements the Implementer interface.
 */
public class FancyRestaurantOrders implements OrderingSystem {
    @Override
    public void place(String order) {
        System.out.println("Placing order for " + order + " at the Fancy Restaurant.");
    }
}
