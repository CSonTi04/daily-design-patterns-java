package bulider.concrete;

import bulider.SandwichBuilder;
import product.Sandwich;

/**
 * Concrete Builder participant
 */
public class TurkeyClub extends SandwichBuilder {
    public TurkeyClub() {
        sandwich = new Sandwich("Turkey Club");
    }

    @Override
    public void addBread() {
        sandwich.addIngredient("bread", "12-Grain");
    }

    @Override
    public void addMeats() {
        sandwich.addIngredient("meat", "Turkey");
    }

    @Override
    public void addCheese() {
        sandwich.addIngredient("cheese", "Swiss");
    }

    @Override
    public void addVeggies() {
        sandwich.addIngredient("veggies", "Lettuce, Tomato");
    }

    @Override
    public void addCondiments() {
        sandwich.addIngredient("condiments", "Mayo");
    }
}
