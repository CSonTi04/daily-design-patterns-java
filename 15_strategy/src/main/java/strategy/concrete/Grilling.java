package strategy.concrete;

import strategy.CookStrategy;

/**
 * Concrete strategy participant
 */
public class Grilling extends CookStrategy {
    @Override
    public void cook(String food) {
        System.out.println("Cooking  " + food + " by grilling it.");
    }
}

