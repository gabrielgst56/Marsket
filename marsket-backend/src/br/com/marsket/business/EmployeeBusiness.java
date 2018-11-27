/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marsket.business;

import br.com.marsket.model.Employee;
import br.com.marsket.repository.EmployeeRepository;
import java.util.ArrayList;

/**
 *
 * @author Pedro Leme
 */
public class EmployeeBusiness {
    
    public ArrayList<Employee> getEmployees() {
        return new EmployeeRepository().getAll();
    }
    
    public Employee getEmployee(int id) {
        return new EmployeeRepository().getObject(id);
    }
    
    public void AddEmployee(Employee employee) {
        new EmployeeRepository().insert(employee);
    }
    
    public void updateEmployee(Employee employee) {
        new EmployeeRepository().update(employee);
    }
    
    public void removeEmployee(int id) {
        new EmployeeRepository().delete(id);
    }
    
}
