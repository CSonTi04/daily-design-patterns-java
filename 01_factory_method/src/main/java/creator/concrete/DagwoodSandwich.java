package creator.concrete;

import creator.Sandwich;
import product.concrete.Bread;
import product.concrete.Lettuce;
import product.concrete.Mayonnaise;
import product.concrete.Turkey;

/**
 * Concrete product - Dagwood sandwich
 */
public class DagwoodSandwich extends Sandwich {
    @Override
    public void createIngredients() {
        getIngredients().add(new Bread());
        getIngredients().add(new Mayonnaise());
        getIngredients().add(new Lettuce());
        getIngredients().add(new Turkey());
        getIngredients().add(new Turkey());
        getIngredients().add(new Bread());
        getIngredients().add(new Bread());
        getIngredients().add(new Mayonnaise());
        getIngredients().add(new Lettuce());
        getIngredients().add(new Turkey());
        getIngredients().add(new Turkey());
        getIngredients().add(new Bread());
    }
}
