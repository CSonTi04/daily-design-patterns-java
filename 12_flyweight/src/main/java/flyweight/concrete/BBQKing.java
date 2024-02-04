package flyweight.concrete;

import flyweight.Slider;

import java.math.BigDecimal;

/**
 * Concrete Flyweight participant
 */
public class BBQKing extends Slider {
    public BBQKing() {
        name = "BBQ King";
        cheese = "American";
        toppings = "Onion rings, lettuce, and BBQ sauce";
        price = BigDecimal.valueOf(2.49);
    }

    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal + " : " + name + " topped with " + cheese + " cheese and " + toppings + "! $" + price);
    }
}
