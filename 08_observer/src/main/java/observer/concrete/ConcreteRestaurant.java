package observer.concrete;

import observer.Restaurant;
import subject.Veggies;
/*
 * ConcreteObserver participant
 */
public class ConcreteRestaurant implements Restaurant {
    private final String name;
    private final double purchaseThreshold;

    public ConcreteRestaurant(String name, double purchaseThreshold) {
        this.name = name;
        this.purchaseThreshold = purchaseThreshold;
    }

    @Override
    public void update(Veggies veggies) {
        System.out.println("Notified " + name + " of " + veggies.getClass().getSimpleName() + " price change to " + veggies.getPricePerPound());
        if (veggies.getPricePerPound() < purchaseThreshold) {
            System.out.println(name + " wants to buy some " + veggies.getClass().getSimpleName() + "!");
        }
    }
}
