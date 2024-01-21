package subsystem.kitchen.order;

import subsystem.kitchen.service.FoodItem;

/**
 * Subsystem - part of subsystem implementation
 */
public class Order {
    private FoodItem appetizer;
    private FoodItem entree;
    private FoodItem drink;

    public FoodItem getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(FoodItem appetizer) {
        this.appetizer = appetizer;
    }

    public FoodItem getEntree() {
        return entree;
    }

    public void setEntree(FoodItem entree) {
        this.entree = entree;
    }

    public FoodItem getDrink() {
        return drink;
    }

    public void setDrink(FoodItem drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "appetizer=" + appetizer +
                ", entree=" + entree +
                ", drink=" + drink +
                '}';
    }
}
