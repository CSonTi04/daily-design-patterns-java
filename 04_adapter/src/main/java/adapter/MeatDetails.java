package adapter;

import adaptee.legacy_api.MeatDatabase;
import adaptee.legacy_api.MeatType;
import tgt.Meat;

/**
 * MeatDetails - adapter participant, wraps target participant
 */
public class MeatDetails extends Meat {

    public MeatDetails(MeatType type) {
        super(type);
    }

    @Override
    public void loadData() {
        MeatDatabase meatDatabase = new MeatDatabase();
        safeCookTempFahrenheit = meatDatabase.getSafeCookTemp(type, adaptee.legacy_api.TemperatureType.FAHRENHEIT);
        safeCookTempCelsius = meatDatabase.getSafeCookTemp(type, adaptee.legacy_api.TemperatureType.CELSIUS);
        caloriesPerOunce = meatDatabase.getCaloriesPerOunce(type);
        proteinPerOunce = meatDatabase.getProteinPerOunce(type);
        System.out.println("Safe cook temp (F): " + safeCookTempFahrenheit);
        System.out.println("Safe cook temp (C): " + safeCookTempCelsius);
        System.out.println("Calories per ounce: " + caloriesPerOunce);
        System.out.println("Protein per ounce: " + proteinPerOunce);
    }
}
