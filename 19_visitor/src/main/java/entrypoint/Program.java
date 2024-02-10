package entrypoint;

import object_structure.Employees;
import object_structure.employee.GeneralManager;
import object_structure.employee.HeadChed;
import object_structure.employee.LineCook;
import visitor.concrete.IncomeVisitor;
import visitor.concrete.PaidTimeOffVisitor;

public class Program {
    public static void main(String[] args) {
        var employees = new Employees();
        employees.attach(new LineCook());
        employees.attach(new HeadChed());
        employees.attach(new GeneralManager());

        employees.accept(new IncomeVisitor());
        employees.accept(new PaidTimeOffVisitor());
    }
}
