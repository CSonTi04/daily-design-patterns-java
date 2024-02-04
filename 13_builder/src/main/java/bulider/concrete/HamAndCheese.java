package bulider.concrete;

import bulider.SandwichBuilder;
import product.Sandwich;

/**
 * Concrete Builder participant
 */
public class HamAndCheese extends SandwichBuilder {

    public HamAndCheese() {
        sandwich = new Sandwich("Ham and Cheese");
    }

    @Override
    public void addBread() {
        sandwich.addIngredient("bread", "White");
    }

    @Override
    public void addMeats() {
        sandwich.addIngredient("meat", "Ham");
    }

    @Override
    public void addCheese() {
        sandwich.addIngredient("cheese", "American");
    }

    @Override
    public void addVeggies() {
        sandwich.addIngredient("veggies", "None");
    }

    @Override
    public void addCondiments() {
        sandwich.addIngredient("condiments", "Mayo");
    }
}
