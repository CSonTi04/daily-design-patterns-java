package state.concrete;

import context.Steak;
import state.Doneness;

/**
 * Concrete state
 */
public class Medium extends Doneness {

    public Medium(Doneness state) {
        currentTemp = state.getCurrentTemp();
        steak = state.getSteak();
        initialize();
    }

    public Medium(double currentTemp, Steak steak) {
        this.currentTemp = currentTemp;
        this.steak = steak;
        this.canEat = true;
        initialize();
    }

    public void initialize() {
        lowerTemp = 155;
        upperTemp = 169.9999;
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
        if (currentTemp < 130.0) {
            steak.setState(new Uncooked(this));
        } else if (currentTemp < lowerTemp) {
            steak.setState(new MediumRare(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new WellDone(this));
        }
    }
}
