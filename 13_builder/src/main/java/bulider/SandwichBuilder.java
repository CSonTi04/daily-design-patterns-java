package bulider;

import product.Sandwich;

/**
 * Builder participant
 */
public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public Sandwich getSandwich() {
        return sandwich;
    }

    public abstract void addBread();

    public abstract void addMeats();

    public abstract void addCheese();

    public abstract void addVeggies();

    public abstract void addCondiments();
}
