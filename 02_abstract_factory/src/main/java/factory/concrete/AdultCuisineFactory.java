package factory.concrete;

import factory.abstr.RecipeFactory;
import product.abstr.Dessert;
import product.abstr.Sandwich;
import product.concrete.BltSandwich;
import product.concrete.CremeBrulee;

/**
 * Concrete factory - creates adult cuisine by implementing the abstract factory's methods
 */
public class AdultCuisineFactory extends RecipeFactory {
    @Override
    public Dessert createDessert() {
        return new CremeBrulee();
    }

    @Override
    public Sandwich createSandwich() {
        return new BltSandwich();
    }
}
