package entrypoint;

import flyweight.factory.SliderFactory;

/**
 * Client participant
 */
public class Program {
    public static void main(String[] args) {
        //Build a slider order using patron's input
        var console = System.console();
        var order = console.readLine("Please enter your slider order (use characters B, V, Z with no spaces):");
        var chars = order.toCharArray();

        var sliderFactory = new SliderFactory();

        int orderTotal = 0;

        //Get the slider from the factory and
        for (char c : chars) {
            orderTotal++;
            var slider = sliderFactory.getSlider(String.valueOf(c));
            slider.display(orderTotal);
        }

    }
}
