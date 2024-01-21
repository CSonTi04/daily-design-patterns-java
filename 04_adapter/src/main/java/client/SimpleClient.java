package client;

import adapter.MeatDetails;
import adapter.SimpleMeatTypeConverter;

/**
 * SimpleClient - client participant
 */
public class SimpleClient {
    private final SimpleMeatTypeConverter simpleMeatTypeConverter = new SimpleMeatTypeConverter();

    public MeatDetails getMeatDetails(String meatName) {
        return new MeatDetails(simpleMeatTypeConverter.convert(meatName));
    }
}
