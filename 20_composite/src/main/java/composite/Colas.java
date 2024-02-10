package composite;

import model.SoftDrink;

import java.util.ArrayList;
import java.util.List;

/*
 * Composite participant
 */
public class Colas {
    private List<SoftDrink> availableFlavours;

    public Colas() {
        this.availableFlavours = new ArrayList<>();
    }

    public List<SoftDrink> getAvailableFlavours() {
        return availableFlavours;
    }

    public void setAvailableFlavours(List<SoftDrink> availableFlavours) {
        this.availableFlavours = availableFlavours;
    }
}
