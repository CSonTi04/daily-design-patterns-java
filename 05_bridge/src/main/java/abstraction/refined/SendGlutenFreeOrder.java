package abstraction.refined;

import abstraction.SendOrder;

/**
 * Refined Abstraction participant, extends the interface defined by the Abstraction.
 */
public class SendGlutenFreeOrder extends SendOrder {

    @Override
    public void send() {
        this.getRestaurant().place("Gluten-Free Order");
    }
}
