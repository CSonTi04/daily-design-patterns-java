package subject;

import observer.Restaurant;

import java.util.ArrayList;
import java.util.List;

/*
 * Subject participant
 * Declares an interface for attaching and detaching and notify Observer objects.
 */
public abstract class Veggies {
    private double pricePerPound;
    private final List<Restaurant> restaurants = new ArrayList<>();

    protected Veggies(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public void attach(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void detach(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }

    public void notifyObservers() {
        for (Restaurant restaurant : restaurants) {
            restaurant.update(this);
        }
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
        notifyObservers();
    }

}
