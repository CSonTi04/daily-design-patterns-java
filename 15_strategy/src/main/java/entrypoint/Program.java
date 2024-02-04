package entrypoint;

import context.CookingMethod;
import strategy.concrete.DeepFrying;
import strategy.concrete.Grilling;
import strategy.concrete.OvenBaking;

public class Program {
    public static void main(String[] args) {
        var cookingMethod = new CookingMethod();

        System.out.println("What food would you like to cook?");
        var food = System.console().readLine();
        cookingMethod.setFood(food);

        System.out.println("What cooking strategy would you like to use (1-3)?");
        int input = Integer.parseInt(System.console().readLine());

        switch (input) {
            case 1 -> {
                cookingMethod.setCookStrategy(new Grilling());
                cookingMethod.cook();
            }
            case 2 -> {
                cookingMethod.setCookStrategy(new DeepFrying());
                cookingMethod.cook();
            }
            case 3 -> {
                cookingMethod.setCookStrategy(new OvenBaking());
                cookingMethod.cook();
            }
            default -> {
                System.out.println("Invalid selection!");
                System.exit(0);
            }
        }
    }
}
