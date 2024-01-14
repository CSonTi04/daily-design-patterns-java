package factory.concrete;

import factory.abstr.RecipeFactory;
import product.abstr.Dessert;
import product.abstr.Sandwich;
import product.concrete.GrilledCheeseSandwich;
import product.concrete.IceCreamSundae;

/**
 * Concrete factory - creates kid cuisine by implementing the abstract factory's methods
 */
public class KidCuisineFactory extends RecipeFactory {
    @Override
    public Sandwich createSandwich() {
        return new GrilledCheeseSandwich();
    }

    @Override
    public Dessert createDessert() {
        return new IceCreamSundae();
    }
}
