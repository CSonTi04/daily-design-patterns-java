package entrypoint;

import component.SoftDrinkDispenser;
import composite.Colas;
import composite.RootBeers;
import leaves.CherryCola;
import leaves.OriginalCola;
import leaves.OriginalRootBeer;
import leaves.VanillaRootBeer;

/*
 * Client participant
 */
public class Program {
    public static void main(String[] args) {
        var colas = new Colas();
        colas.getAvailableFlavours().add(new OriginalCola(215));
        colas.getAvailableFlavours().add(new CherryCola(210));

        var rootBeers = new RootBeers();
        rootBeers.getAvailableFlavours().add(new OriginalRootBeer(225));
        rootBeers.getAvailableFlavours().add(new VanillaRootBeer(225));

        var softDrinkDispenser = new SoftDrinkDispenser();
        softDrinkDispenser.getFlavours().addAll(colas.getAvailableFlavours());
        softDrinkDispenser.getFlavours().addAll(rootBeers.getAvailableFlavours());
        softDrinkDispenser.displayCalories();
    }
}
