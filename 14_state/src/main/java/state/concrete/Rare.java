package state.concrete;

import context.Steak;
import state.Doneness;

/**
 * Concrete state
 */
public class Rare extends Doneness {

    public Rare(Doneness state) {
        currentTemp = state.getCurrentTemp();
        steak = state.getSteak();
        initialize();
    }

    public Rare(double currentTemp, Steak steak) {
        this.currentTemp = currentTemp;
        this.steak = steak;
        this.canEat = true;
        initialize();
    }

    public void initialize() {
        lowerTemp = 130;
        upperTemp = 139.9999;
        canEat = true;
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
        if (currentTemp < lowerTemp) {
            steak.setState(new Uncooked(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new MediumRare(this));
        }
    }
}
