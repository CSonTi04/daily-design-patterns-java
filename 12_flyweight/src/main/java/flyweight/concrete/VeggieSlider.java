package flyweight.concrete;

import flyweight.Slider;

import java.math.BigDecimal;

/**
 * Concrete Flyweight participant
 */
public class VeggieSlider extends Slider {
    public VeggieSlider() {
        name = "Veggie Slider";
        cheese = "Swiss";
        toppings = "lettuce, onion, tomato and pickles";
        price = BigDecimal.valueOf(1.99);
    }

    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal + " : " + name + " topped with " + cheese + " cheese and " + toppings + "! $" + price);
    }
}
