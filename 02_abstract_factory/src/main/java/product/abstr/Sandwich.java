package product.abstr;

/**
 * Abstract product - Sandwich
 */
public abstract class Sandwich {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
