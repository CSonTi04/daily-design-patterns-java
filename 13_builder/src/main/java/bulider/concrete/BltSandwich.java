package bulider.concrete;

import bulider.SandwichBuilder;
import product.Sandwich;

/**
 * Concrete Builder participant
 */
public class BltSandwich extends SandwichBuilder {

    public BltSandwich() {
        sandwich = new Sandwich("BLT");
    }

    @Override
    public void addBread() {
        sandwich.addIngredient("bread", "White");
    }

    @Override
    public void addMeats() {
        sandwich.addIngredient("meat", "Bacon");
    }

    @Override
    public void addCheese() {
        sandwich.addIngredient("cheese", "None");
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
