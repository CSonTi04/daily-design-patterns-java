package object_structure;

import element.concrete.Employee;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private final List<Employee> employeeList = new ArrayList<>();

    public void attach(Employee employee) {
        employeeList.add(employee);
    }

    public void detach(Employee employee) {
        employeeList.remove(employee);
    }

    public void accept(Visitor visitor) {
        for (Employee employee : employeeList) {
            employee.accept(visitor);
        }
    }


}
