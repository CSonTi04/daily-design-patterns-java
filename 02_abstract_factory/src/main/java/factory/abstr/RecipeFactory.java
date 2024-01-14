package factory.abstr;

import product.abstr.Dessert;
import product.abstr.Sandwich;

/**
 * Abstract factory - defines creation methods for products
 */
public abstract class RecipeFactory {
    public abstract Sandwich createSandwich();

    public abstract Dessert createDessert();
}
