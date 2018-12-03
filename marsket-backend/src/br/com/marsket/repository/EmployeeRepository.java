/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marsket.repository;

import br.com.marsket.model.Employee;
import java.util.LinkedList;

/**
 *
 * @author Pedro Leme
 */
public class EmployeeRepository implements BaseRepository<Employee> {

	private LinkedList<Employee> Employee;
	
	public EmployeeRepository() {
    	if(StaticRepository.initialize == false) {
    		StaticRepository.initList();
    		System.out.println("Euuu");
    	}
    	
    	Employee = new LinkedList<>();
        for(Employee employee : Employee) {
        	Employee.add(employee);
        }
		
	}
	
    @Override
    public LinkedList<Employee> getAll() {
        return this.Employee;
    }

    @Override
    public Employee getObject(int id) {
        for (Employee employee : Employee) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void insert(Employee m) {
        if (!Employee.isEmpty()) {
            m.setId(Employee.getLast().getId() + 1);
        } else {
            m.setId(0);
        }
        Employee.add(m);
    }

    @Override
    public void update(Employee m) {
        for (int i = 0; i < Employee.size(); i++) {
            if (Employee.get(i).getId() == m.getId()) {
                Employee.set(i, m);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < Employee.size(); i++) {
            if (Employee.get(i).getId() == id) {
                Employee.remove(i);
                break;
            }
        }
    }

}
