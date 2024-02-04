package caretaker;

import memento.FoodSupplierMemento;
/**
 * Caretaker participant
 */
public class SupplierMemory {
    private FoodSupplierMemento memento;

    public FoodSupplierMemento getMemento() {
        return memento;
    }

    public void setMemento(FoodSupplierMemento memento) {
        this.memento = memento;
    }
}
