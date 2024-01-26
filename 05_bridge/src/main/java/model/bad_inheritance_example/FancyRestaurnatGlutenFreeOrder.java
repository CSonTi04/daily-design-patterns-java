package model.bad_inheritance_example;

import model.dietary_restriction.GlutenFreeOrder;
import model.restaurant.FancyRestaurantOrder;

/**
 * This class represents a fancy restaurant order that is gluten-free.
 */
public class FancyRestaurnatGlutenFreeOrder extends GlutenFreeOrder implements FancyRestaurantOrder {
}
