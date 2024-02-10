package visitor.concrete;

import element.Element;
import element.concrete.Employee;
import visitor.Visitor;

/**
 * ConcreteVisitor participant
 */
public class PaidTimeOffVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        Employee employee = (Employee) element;
        employee.setPaidTimeOffDays(employee.getPaidTimeOffDays() + 3);
        System.out.printf("%s %s's new vacation days: %d%n", employee.getClass().getSimpleName(), employee.getName(), employee.getPaidTimeOffDays());
    }
}
