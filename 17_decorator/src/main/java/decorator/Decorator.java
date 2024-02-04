package decorator;

import component.RestaurantDish;

/**
 * Decorator participant of the Decorator design pattern
 */
public abstract class Decorator extends RestaurantDish {
    protected RestaurantDish restaurantDish;

    protected Decorator(RestaurantDish restaurantDish) {
        this.restaurantDish = restaurantDish;
    }

    @Override
    public void display() {
        restaurantDish.display();
    }
}
