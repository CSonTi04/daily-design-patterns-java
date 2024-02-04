package context;

import strategy.CookStrategy;

/**
 * Context participant, maintains a reference to a Strategy object.
 */
public class CookingMethod {
    private String food;
    private CookStrategy cookStrategy;

    public void setFood(String food) {
        this.food = food;
    }

    public void setCookStrategy(CookStrategy cookStrategy) {
        this.cookStrategy = cookStrategy;
    }

    public void cook() {
        cookStrategy.cook(food);
        System.out.println();
    }
}
