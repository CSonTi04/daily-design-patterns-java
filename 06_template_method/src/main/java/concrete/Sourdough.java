package concrete;

import abstr.Bread;

/**
 * This ConcreteClass participates in the Template Method design pattern.
 */

public class Sourdough extends Bread {
    @Override
    protected void mixIngredients() {
        System.out.println("Gathering Ingredients for Sourdough Bread.");
    }

    @Override
    protected void bake() {
        System.out.println("Baking the Sourdough Bread. (20 minutes)");
    }
}
