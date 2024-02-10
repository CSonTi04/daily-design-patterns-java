package element.concrete;

import element.Element;
import visitor.Visitor;

/**
 * The ConcreteElement participant, implements an accept operation that takes a visitor as an argument.
 */
public class Employee extends Element {
    private String name;
    private double annualSalary;
    private int paidTimeOffDays;

    public Employee(String name, double annualSalary, int paidTimeOffDays) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.paidTimeOffDays = paidTimeOffDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getPaidTimeOffDays() {
        return paidTimeOffDays;
    }

    public void setPaidTimeOffDays(int paidTimeOffDays) {
        this.paidTimeOffDays = paidTimeOffDays;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
