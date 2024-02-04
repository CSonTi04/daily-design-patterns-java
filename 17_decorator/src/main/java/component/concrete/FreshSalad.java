package component.concrete;

import component.RestaurantDish;

/**
 * ConcreteComponent participant of the Decorator design pattern
 */
public class FreshSalad extends RestaurantDish {
    private final String greens;
    private final String cheese;
    private final String dressing;

    public FreshSalad(String greens, String cheese, String dressing) {
        this.greens = greens;
        this.cheese = cheese;
        this.dressing = dressing;
    }

    @Override
    public void display() {
        System.out.println("Fresh Salad: ");
        System.out.println("Greens: " + greens);
        System.out.println("Cheese: " + cheese);
        System.out.println("Dressing: " + dressing);
        System.out.println( );
    }
}
