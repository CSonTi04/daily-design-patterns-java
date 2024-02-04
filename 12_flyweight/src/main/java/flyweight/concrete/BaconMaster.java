package flyweight.concrete;

import flyweight.Slider;

import java.math.BigDecimal;

/**
 * Concrete Flyweight participant
 */
public class BaconMaster extends Slider {
    public BaconMaster() {
        name = "Bacon Master";
        cheese = "American";
        toppings = "lots of bacon";
        price = BigDecimal.valueOf(2.39);
    }

    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal + " : " + name + " topped with " + cheese + " cheese and " + toppings + "! $" + price);
    }
}
