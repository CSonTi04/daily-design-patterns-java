package prototype.concrete;

import prototype.SandwichPrototype;

/**
 * Concrete prototype participant, which implements the prototype interface
 */
public class Sandwich extends SandwichPrototype {
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String veggie;

    public Sandwich(String bread, String meat, String cheese, String veggie) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggie = veggie;
    }

    @Override
    public SandwichPrototype cloneSandwich() throws CloneNotSupportedException {
        System.out.println("Cloning sandwich with ingredients: " + this);
        return (SandwichPrototype) super.clone();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", veggie='" + veggie + '\'' +
                '}';
    }
}
