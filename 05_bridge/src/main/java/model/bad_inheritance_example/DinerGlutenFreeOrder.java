package model.bad_inheritance_example;

import model.dietary_restriction.GlutenFreeOrder;
import model.restaurant.DinerOrder;

/**
 * This class represents a diner order that is gluten free.
 */
public class DinerGlutenFreeOrder extends GlutenFreeOrder implements DinerOrder {
}
