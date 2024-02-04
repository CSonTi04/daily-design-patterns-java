package decorator.concrete;

import component.RestaurantDish;
import decorator.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteDecorator participant of the Decorator design pattern
 * This class will impart responsibilities onto the concrete components
 */
public class Available extends Decorator {
    private int numberOfAvailable;
    protected List<String> customers = new ArrayList<>();

    public Available(RestaurantDish restaurantDish, int numberOfAvailable) {
        super(restaurantDish);
        this.numberOfAvailable = numberOfAvailable;
    }

    public int getNumberOfAvailable() {
        return numberOfAvailable;
    }

    public void setNumberOfAvailable(int numberOfAvailable) {
        this.numberOfAvailable = numberOfAvailable;
    }

    public void orderItem(String customerName) {
        if (numberOfAvailable > 0) {
            customers.add(customerName);
            numberOfAvailable--;
        } else {
            System.out.println("Not enough ingredients for " + customerName + "'s order");
        }
    }

    @Override
    public void display() {
        super.display();
        customers.forEach(customer -> System.out.println("Ordered by: " + customer));
        System.out.println();
    }
}
