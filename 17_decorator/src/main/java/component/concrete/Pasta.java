package component.concrete;

import component.RestaurantDish;

public class Pasta extends RestaurantDish {
    private final String pastaType;
    private final String sauce;

    public Pasta(String pastaType, String sauce) {
        this.pastaType = pastaType;
        this.sauce = sauce;
    }

    @Override
    public void display() {
        System.out.println("Classic pasta: ");
        System.out.println("Pasta: " + pastaType);
        System.out.println("Sauce: " + sauce);
        System.out.println();
    }
}
