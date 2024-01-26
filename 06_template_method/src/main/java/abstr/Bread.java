package abstr;

/**
 * This AbstractClass participates in the Template Method design pattern.
 */
public abstract class Bread {

    protected abstract void mixIngredients();

    protected abstract void bake();

    public void slice() {
        System.out.println("Slicing the " + this.getClass().getSimpleName() + " bread!");
    }

    /**
     * This method is the Template Method.
     * It is final so that subclasses cannot override it.
     */
    public final void make() {
        mixIngredients();
        bake();
        slice();
    }
}
