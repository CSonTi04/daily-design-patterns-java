package visitor.concrete;

import element.Element;
import element.concrete.Employee;
import visitor.Visitor;

/**
 * ConcreteVisitor participant
 */
public class IncomeVisitor implements Visitor {

    @Override
    public void visit(Element element) {
        Employee employee = (Employee) element;
        employee.setAnnualSalary(employee.getAnnualSalary() * 1.10);
        System.out.printf("%s %s's new income: $%.2f%n", employee.getClass().getSimpleName(), employee.getName(), employee.getAnnualSalary());
    }
}
