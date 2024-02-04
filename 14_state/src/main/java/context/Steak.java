package context;

import state.Doneness;
import state.concrete.Rare;

/**
 * Context participant
 */
public class Steak {
    private Doneness state;
    private final String beefCut;

    public Steak(String beefCut) {
        this.beefCut = beefCut;
        this.state = new Rare(0.0, this);
    }

    public double getCurrentTemp() {
        return state.getCurrentTemp();
    }

    public void addTemp(double temp) {
        state.addTemp(temp);
        System.out.println("Increased temperature by " + temp + " degrees.");
        System.out.println("Current temp is " + getCurrentTemp() + " degrees.");
        System.out.println("Status is " + state.getClass().getSimpleName());
        System.out.println();
    }

    public void removeTemp(double temp) {
        state.removeTemp(temp);
        System.out.println("Decreased temperature by " + temp + " degrees.");
        System.out.println("Current temp is " + getCurrentTemp() + " degrees.");
        System.out.println("Status is " + state.getClass().getSimpleName());
        System.out.println();
    }

    public Doneness getState() {
        return state;
    }

    public void setState(Doneness state) {
        this.state = state;
    }
}
