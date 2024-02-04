package state;

import context.Steak;

/**
 * State participant
 */
public abstract class Doneness {
    protected Steak steak;
    protected double currentTemp;
    protected double lowerTemp;
    protected double upperTemp;
    protected boolean canEat;

    public Steak getSteak() {
        return steak;
    }

    public void setSteak(Steak steak) {
        this.steak = steak;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public abstract void addTemp(double temp);
    public abstract void removeTemp(double temp);
    public abstract void donenessCheck();
}
