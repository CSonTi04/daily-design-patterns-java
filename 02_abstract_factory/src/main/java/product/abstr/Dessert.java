package product.abstr;

/**
 * Abstract product - Dessert
 */
public abstract class Dessert {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
