package flyweight.factory;

import flyweight.Slider;
import flyweight.concrete.BBQKing;
import flyweight.concrete.BaconMaster;
import flyweight.concrete.VeggieSlider;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory participant
 */
public class SliderFactory {

    private final Map<String, Slider> sliders = new HashMap<>();

    public Slider getSlider(String name) {
        Slider slider = sliders.get(name);
        if (slider == null) {
            slider = switch (name) {
                case "B" -> new BaconMaster();
                case "V" -> new VeggieSlider();
                case "Q" -> new BBQKing();
                default -> throw new IllegalArgumentException("No such slider.");
            };
            sliders.put(name, slider);
        }
        return slider;
    }
}
