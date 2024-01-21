package facade;

import client.Patron;
import subsystem.kitchen.service.Bar;
import subsystem.kitchen.service.ColdPrep;
import subsystem.kitchen.service.HotPrep;
import subsystem.kitchen.order.Order;

/**
 * Facade - hides the complexity of subsystem from client
 */
public class Server {
    private final ColdPrep coldPrep = new ColdPrep();
    private final HotPrep hotPrep = new HotPrep();
    private final Bar bar = new Bar();

    public Order placeOrder(Patron patron, int coldAppId, int hotEntreeId, int drinkId) {
        System.out.println("Server places order for " + patron.getName() + " for cold app #" + coldAppId + ", hot entree #" + hotEntreeId + ", and drink #" + drinkId);
        Order order = new Order();
        order.setAppetizer(coldPrep.prepDish(coldAppId));
        order.setEntree(hotPrep.prepDish(hotEntreeId));
        order.setDrink(bar.prepDish(drinkId));
        return order;
    }
}
