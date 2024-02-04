package director;

import bulider.SandwichBuilder;

/**
 * Director participant
 */
public class AssemblyLine {

    public void assemble(SandwichBuilder sandwichBuilder){
        sandwichBuilder.addBread();
        sandwichBuilder.addMeats();
        sandwichBuilder.addCheese();
        sandwichBuilder.addVeggies();
        sandwichBuilder.addCondiments();
    }
}
