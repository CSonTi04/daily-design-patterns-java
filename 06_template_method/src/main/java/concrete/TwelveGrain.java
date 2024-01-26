package concrete;

import abstr.Bread;

/**
 * This ConcreteClass participates in the Template Method design pattern.
 */

public class TwelveGrain extends Bread {
    @Override
    protected void mixIngredients() {
        System.out.println("Gathering Ingredients for 12-Grain Bread.");
    }

    @Override
    protected void bake() {
        System.out.println("Baking the 12-Grain Bread. (25 minutes)");
    }
}
