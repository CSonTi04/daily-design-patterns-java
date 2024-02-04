package strategy.concrete;

import strategy.CookStrategy;

public class DeepFrying extends CookStrategy {
    @Override
    public void cook(String food) {
        System.out.println("Cooking  " + food + " by deep frying it.");
    }
}
