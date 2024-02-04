package state.concrete;

import state.Doneness;

/**
 * Concrete state participant
 */
public class Uncooked extends Doneness {

    public Uncooked(Doneness state) {
        currentTemp = state.getCurrentTemp();
        steak = state.getSteak();
        initialize();
    }

    public void initialize() {
        lowerTemp = 0;
        upperTemp = 130;
        canEat = false;
    }

    @Override
    public void addTemp(double temp) {
        currentTemp += temp;
        donenessCheck();
    }

    @Override
    public void removeTemp(double temp) {
        currentTemp -= temp;
        donenessCheck();
    }

    @Override
    public void donenessCheck() {
        if (currentTemp > upperTemp) {
            steak.setState(new Rare(this));
        }
    }
}
