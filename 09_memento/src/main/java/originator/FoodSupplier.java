package originator;

import memento.FoodSupplierMemento;

/**
 * Originator participant, which is the class for which we want to save Mementos for its state
 */
public class FoodSupplier {
    private String name;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FoodSupplierMemento saveMemento() {
        System.out.println("Saving current state");
        System.out.println(this);
        return new FoodSupplierMemento(name, phone, address);
    }

    public void restoreMemento(FoodSupplierMemento memento) {
        System.out.println("Restoring previous state");
        this.name = memento.getName();
        this.phone = memento.getPhone();
        this.address = memento.getAddress();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FoodSupplier{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
