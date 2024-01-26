package abstraction;

import implementer.OrderingSystem;

/**
 * Abstraction participant, maintains reference to an Implementor object.
 */
public abstract class SendOrder {
    private OrderingSystem restaurant;

    public void setRestaurant(OrderingSystem restaurant) {
        this.restaurant = restaurant;
    }

    public OrderingSystem getRestaurant() {
        return restaurant;
    }

    public abstract void send();
}
