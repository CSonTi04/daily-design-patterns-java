package entrypoint;

import bulider.SandwichBuilder;
import bulider.concrete.BltSandwich;
import bulider.concrete.HamAndCheese;
import bulider.concrete.TurkeyClub;
import director.AssemblyLine;

public class Program {
    public static void main(String[] args) {
        SandwichBuilder builder;
        //Create ship with assembly line
        AssemblyLine shop = new AssemblyLine();
        // Construct and display sandwiches
        builder = new HamAndCheese();
        shop.assemble(builder);
        System.out.println(builder.getSandwich().toString());

        builder = new BltSandwich();
        shop.assemble(builder);
        System.out.println(builder.getSandwich().toString());

        builder = new TurkeyClub();
        shop.assemble(builder);
        System.out.println(builder.getSandwich().toString());

    }
}
