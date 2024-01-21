package adapter;

import adaptee.legacy_api.MeatType;

public class SimpleMeatTypeConverter {
    public MeatType convert(String meatName) {
        return switch (meatName.toLowerCase()) {
            case "beef" -> MeatType.BEEF;
            case "pork" -> MeatType.PORK;
            case "chicken" -> MeatType.CHICKEN;
            case "turkey" -> MeatType.TURKEY;
            case "veal" -> MeatType.VEAL;
            default -> throw new IllegalArgumentException("Unknown meat type: " + meatName);
        };
    }
}
