package creator;

import product.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator participant
 */
public abstract class Sandwich {
    private List<Ingredient> ingredients = new ArrayList<>();

    protected Sandwich() {
        createIngredients();
    }

    /**
     * Factory method
     */
    public abstract void createIngredients();

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
