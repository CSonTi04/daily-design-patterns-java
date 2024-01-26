package entrypoint;

import concrete.Sourdough;
import concrete.TwelveGrain;
import concrete.WholeWheat;

public class Program {
    public static void main(String[] args) {
        WholeWheat wholeWheat = new WholeWheat();
        wholeWheat.make();

        TwelveGrain twelveGrain = new TwelveGrain();
        twelveGrain.make();

        Sourdough sourdough = new Sourdough();
        sourdough.make();
    }
}
