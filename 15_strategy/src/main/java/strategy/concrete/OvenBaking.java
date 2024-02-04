package strategy.concrete;

import strategy.CookStrategy;
/**
 * Concrete strategy participant
 */
public class OvenBaking extends CookStrategy {
    @Override
    public void cook(String food) {
        System.out.println("Cooking  " + food + " by oven baking it.");
    }
}
