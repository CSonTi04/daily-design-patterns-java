package model.bad_inheritance_example;

import model.dietary_restriction.DairyFreeOrder;
import model.restaurant.FancyRestaurantOrder;

/**
 * This class represents a fancy restaurant order that is dairy-free.
 */
public class FancyRestaurantDairyFreeOrder extends DairyFreeOrder implements FancyRestaurantOrder {
}
