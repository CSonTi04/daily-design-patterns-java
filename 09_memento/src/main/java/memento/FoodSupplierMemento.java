package memento;
/**
 * Memento participant, which is the class that stores the state of the Originator
 */
public class FoodSupplierMemento {
    private final String name;
    private final String phone;
    private final String address;

    public FoodSupplierMemento(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
