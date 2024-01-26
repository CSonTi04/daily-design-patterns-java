package entrypoint;

import abstraction.SendOrder;
import abstraction.refined.SendDairyFreeOrder;
import abstraction.refined.SendGlutenFreeOrder;
import implementer.concrete.DinerOrders;
import implementer.concrete.FancyRestaurantOrders;

public class Program {
    public static void main(String[] args) {
        SendOrder sendOrder = new SendDairyFreeOrder();
        sendOrder.setRestaurant(new DinerOrders());
        sendOrder.send();

        sendOrder.setRestaurant(new FancyRestaurantOrders());
        sendOrder.send();

        sendOrder = new SendGlutenFreeOrder();
        sendOrder.setRestaurant(new DinerOrders());
        sendOrder.send();

        sendOrder.setRestaurant(new FancyRestaurantOrders());
        sendOrder.send();
    }
}
