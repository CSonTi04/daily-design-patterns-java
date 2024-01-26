package model.bad_inheritance_example;

import model.dietary_restriction.DairyFreeOrder;
import model.restaurant.DinerOrder;

/**
 * This class represents a diner order that is dairy-free.
 */
public class DinerDairyFreeOrder extends DairyFreeOrder implements DinerOrder {
}
