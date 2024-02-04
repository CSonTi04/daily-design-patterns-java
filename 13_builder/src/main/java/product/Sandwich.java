package product;

import java.util.HashMap;

/**
 * Product participant
 */
public class Sandwich {
    private final String sandwichType;
    private final HashMap<String, String> ingredients = new HashMap<>();

    public Sandwich(String sandwichType) {
        this.sandwichType = sandwichType;
    }

    public String getIngridient(String key){
        return ingredients.get(key);
    }

    public void addIngredient(String key, String value){
        ingredients.put(key, value);
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichType='"    + sandwichType + '\'' + "\t" +
                ", \tBread='"       + ingredients.get("bread") + '\'' +
                ", \tMeat='"        + ingredients.get("meat") + '\'' +
                ", \tCheese='"      + ingredients.get("cheese") + '\'' +
                ", \tVeggies='"     + ingredients.get("veggies") + '\'' +
                ", \tCondiments='"  + ingredients.get("condiments") + '\'' +
                '}';
    }
}
