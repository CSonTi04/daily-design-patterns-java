package entrypoint;

import prototype.concrete.Sandwich;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {

        var sandwichMenu = new HashMap<String, Sandwich>();
        //Initialize with some default sandwiches
        sandwichMenu.put("BLT", new Sandwich("Wheat", "Bacon", "", "Lettuce, Tomato"));
        sandwichMenu.put("PB&J", new Sandwich("White", "", "", "Peanut Butter, Jelly"));
        sandwichMenu.put("Turkey", new Sandwich("Rye", "Turkey", "Swiss", "Lettuce, Onion, Tomato"));
        //Deli manager adds custom sandwiches
        sandwichMenu.put("Loaded BLT", new Sandwich("Wheat", "Turkey, Bacon", "American", "Lettuce, Tomato, Onion, Olives"));
        sandwichMenu.put("ThreeMeatCombo", new Sandwich("Rye", "Turkey, Ham, Salami", "Provolone", "Lettuce, Onion"));
        sandwichMenu.put("Vegetarian", new Sandwich("Wheat", "", "", "Lettuce, Onion, Tomato, Olives, Spinach"));
        //Now we can clone these sandwiches
        Sandwich sandwich1 = (Sandwich) sandwichMenu.get("BLT").cloneSandwich();
        Sandwich sandwich2 = (Sandwich) sandwichMenu.get("ThreeMeatCombo").cloneSandwich();
        Sandwich sandwich3 = (Sandwich) sandwichMenu.get("Vegetarian").cloneSandwich();
    }
}
