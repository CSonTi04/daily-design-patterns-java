package entrypoint;


import component.concrete.FreshSalad;
import component.concrete.Pasta;
import decorator.concrete.Available;

public class Program {
    public static void main(String[] args) {
        //Step 1: Define some dishes, and how many of each we can make
        var caesarSalad = new FreshSalad(
                "Crisp romaine lettuce",
                "Freshly-grated Parmesan cheese",
                "House-made Caesar dressing"
        );
        caesarSalad.display();

        var fettuccineAlfredo = new Pasta(
                "Fettuccine",
                "Alfredo"
        );
        fettuccineAlfredo.display();

        System.out.println("Making these dishes available.");
        //Step 2: Decorate the dishes, now iof we attempt to order the once we're
        // out of ingredients we can notify the customer
        var ceaserSaladAvailable = new Available(caesarSalad, 3);
        var fettuccineAlfredoAvailable = new Available(fettuccineAlfredo, 4);
        //Step 3: Order a bunch of dishes
        ceaserSaladAvailable.orderItem("John");
        ceaserSaladAvailable.orderItem("Sally");
        ceaserSaladAvailable.orderItem("Manush");

        fettuccineAlfredoAvailable.orderItem("Sally");
        fettuccineAlfredoAvailable.orderItem("Francis");
        fettuccineAlfredoAvailable.orderItem("Venkat");
        fettuccineAlfredoAvailable.orderItem("Diana");

        //There won't be enough for this order
        fettuccineAlfredoAvailable.orderItem("Dennis");

        ceaserSaladAvailable.display();
        fettuccineAlfredoAvailable.display();

    }
}
