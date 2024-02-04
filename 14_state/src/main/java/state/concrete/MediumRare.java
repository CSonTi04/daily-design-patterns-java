package state.concrete;

import context.Steak;
import state.Doneness;

/**
 * Concrete state
 */
public class MediumRare extends Doneness {

    public MediumRare(Doneness state) {
        currentTemp = state.getCurrentTemp();
        steak = state.getSteak();
        initialize();
    }

    public MediumRare(double currentTemp, Steak steak) {
        this.currentTemp = currentTemp;
        this.steak = steak;
        this.canEat = true;
        initialize();
    }

    public void initialize() {
        lowerTemp = 140;
        upperTemp = 154.9999;
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
        if (currentTemp < 0.0) {
            steak.setState(new Uncooked(this));
        } else if (currentTemp < lowerTemp) {
            steak.setState(new Rare(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new Medium(this));
        }
    }
}
