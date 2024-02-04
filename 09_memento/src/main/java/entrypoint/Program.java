package entrypoint;

import caretaker.SupplierMemory;
import originator.FoodSupplier;

public class Program {
    public static void main(String[] args) {
        //Adding new food supplier for our restaurant
        FoodSupplier supplier = new FoodSupplier();
        supplier.setName("Harold Karstark");
        supplier.setPhone("(482) 555-1172");
        //Let's store that entry in our database
        SupplierMemory memory = new SupplierMemory();
        memory.setMemento(supplier.saveMemento());
        //Continue changing originator
        supplier.setAddress("548 S Main St. Nowhere, KS");
        //Oops, let's undo that action
        supplier.restoreMemento(memory.getMemento());

    }
}
