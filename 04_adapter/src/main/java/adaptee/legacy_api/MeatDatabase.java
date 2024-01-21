package adaptee.legacy_api;

/**
 * MeatDatabase - adaptee participant
 */
public class MeatDatabase {
    public float getSafeCookTemp(MeatType meat, TemperatureType temperatureType) {
        return switch (meat) {
            case BEEF, PORK -> temperatureType == TemperatureType.FAHRENHEIT ? 145 : 63;
            case CHICKEN, TURKEY -> temperatureType == TemperatureType.FAHRENHEIT ? 165 : 74;
            case VEAL -> temperatureType == TemperatureType.FAHRENHEIT ? 158 : 70;
        };
    }

    public int getCaloriesPerOunce(MeatType meat) {
        return switch (meat) {
            case BEEF -> 71;
            case PORK -> 69;
            case CHICKEN -> 66;
            case TURKEY -> 38;
            case VEAL -> 62;
        };
    }

    public double getProteinPerOunce(MeatType meat) {
        return switch (meat) {
            case BEEF -> 7.33;
            case PORK -> 7.67;
            case CHICKEN -> 8.57;
            case TURKEY -> 8.5;
            case VEAL -> 8.4;
        };
    }
}
