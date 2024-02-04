package flyweight;

import java.math.BigDecimal;

/**
 * Flyweight participant
 */
public abstract class Slider {
    //intrinsic state
    protected String name;
    protected String cheese;
    protected String toppings;
    protected BigDecimal price;

    public abstract void display(int orderTotal);

}
