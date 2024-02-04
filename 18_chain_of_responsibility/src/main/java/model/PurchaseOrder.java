package model;

/**
 * Details of a purchase request.
 */
public class PurchaseOrder {
    private int number;
    private double amount;
    private double price;
    private String name;

    public PurchaseOrder(int number, double amount, double price, String name) {
        this.number = number;
        this.amount = amount;
        this.price = price;
        this.name = name;
        System.out.println("Purchase order " + this + " has been submitted.");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "number=" + number +
                ", amount=" + amount +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
