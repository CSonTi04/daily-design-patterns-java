package product;

/**
 * Product participant
 */
public abstract class Ingredient {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
