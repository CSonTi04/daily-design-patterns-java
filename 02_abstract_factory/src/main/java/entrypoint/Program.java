package entrypoint;

import factory.abstr.RecipeFactory;
import factory.concrete.AdultCuisineFactory;
import factory.concrete.KidCuisineFactory;

public class Program {
    public static void main(String[] args) {
        System.out.println("On today's menu we have:");
        RecipeFactory recipeFactory = new AdultCuisineFactory();
        var sandwich = recipeFactory.createSandwich();
        var dessert = recipeFactory.createDessert();
        System.out.println(sandwich);
        System.out.println(dessert);

        System.out.println("On the kid's menu:");
        recipeFactory = new KidCuisineFactory();
        sandwich = recipeFactory.createSandwich();
        dessert = recipeFactory.createDessert();
        System.out.println(sandwich);
        System.out.println(dessert);
    }
}
