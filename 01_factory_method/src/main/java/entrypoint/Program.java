package entrypoint;

import creator.concrete.DagwoodSandwich;
import creator.concrete.TurkeySandwich;

public class Program {
    public static void main(String[] args) {
        var turkeySandwich = new TurkeySandwich();
        System.out.println("Turkey sandwich ingredients:");
        System.out.println(turkeySandwich.getIngredients());
        var dagwoodSandwich = new DagwoodSandwich();
        System.out.println("Dagwood sandwich ingredients:");
        System.out.println(dagwoodSandwich.getIngredients());
    }
}
