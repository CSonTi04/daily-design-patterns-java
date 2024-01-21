package subsystem.kitchen.service;

/**
 * Subsystem - part of subsystem implementation - participant
 */
public class HotPrep implements KitchenSection {
    public FoodItem prepDish(int dishId) {
        return new FoodItem(dishId);
    }
}
