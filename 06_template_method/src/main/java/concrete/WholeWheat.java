package concrete;

import abstr.Bread;

/**
 * This ConcreteClass participates in the Template Method design pattern.
 */

public class WholeWheat extends Bread {
    @Override
    protected void mixIngredients() {
        System.out.println("Gathering Ingredients for Whole Wheat Bread.");
    }

    @Override
    protected void bake() {
        System.out.println("Baking the Whole Wheat Bread. (15 minutes)");
    }
}
