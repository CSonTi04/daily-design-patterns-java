package subsystem.kitchen.service;

/**
 * Subsystem - part of subsystem implementation
 */
public class FoodItem {
    private final int dishId;

    public FoodItem(int dishId) {
        this.dishId = dishId;
    }

    public int getDishId() {
        return dishId;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "dishId=" + dishId +
                '}';
    }
}
