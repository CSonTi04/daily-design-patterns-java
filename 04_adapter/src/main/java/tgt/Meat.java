package tgt;

import adaptee.legacy_api.MeatType;

/**
 * Meat - target participant
 */
public class Meat {
    protected final MeatType type;
    protected float safeCookTempFahrenheit;
    protected float safeCookTempCelsius;
    protected int caloriesPerOunce;
    protected double proteinPerOunce;

    public Meat(MeatType type) {
        this.type = type;
    }

    public void loadData() {
        System.out.println("Safe cook temp (F): " + safeCookTempFahrenheit);
        System.out.println("Safe cook temp (C): " + safeCookTempCelsius);
        System.out.println("Calories per ounce: " + caloriesPerOunce);
        System.out.println("Protein per ounce: " + proteinPerOunce);
    }


}
