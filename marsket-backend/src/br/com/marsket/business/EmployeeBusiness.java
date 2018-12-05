package br.com.marsket.business;

import br.com.marsket.model.Employee;
import br.com.marsket.repository.EmployeeRepository;
import java.util.LinkedList;

public class EmployeeBusiness {

    public LinkedList<Employee> getEmployees() {
        return new EmployeeRepository().getAll();
    }

    public Employee getEmployee(int id) {
        return new EmployeeRepository().getObject(id);
    }

    public void insertEmployee(Employee employee) {
        new EmployeeRepository().insert(employee);
    }

    public void updateEmployee(Employee employee) {
        new EmployeeRepository().update(employee);
    }

    public void removeEmployee(int id) {
        new EmployeeRepository().delete(id);
    }

}
