package component;

import model.SoftDrink;

import java.util.ArrayList;
import java.util.List;

/**
 * Component participant
 */
public class SoftDrinkDispenser {

    private List<SoftDrink> flavours;

    public SoftDrinkDispenser() {
        flavours = new ArrayList<>();
    }

    public List<SoftDrink> getFlavours() {
        return flavours;
    }

    public void setFlavours(List<SoftDrink> flavours) {
        this.flavours = flavours;
    }

    public void displayCalories() {
        this.flavours.forEach(item -> System.out.println(item.getClass().getSimpleName() + " has " + item.getCalories() + " calories"));
    }
}
