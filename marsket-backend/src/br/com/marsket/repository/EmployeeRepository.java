/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marsket.repository;

import br.com.marsket.model.Employee;
import java.util.ArrayList;

/**
 *
 * @author Pedro Leme
 */
public class EmployeeRepository implements BaseRepository<Employee> {

    @Override
    public ArrayList<Employee> getAll() {
        return StaticRepository.listEmployee;
    }

    @Override
    public Employee getObject(int id) {
        for (Employee employee : StaticRepository.listEmployee) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void insert(Employee m) {
        if (!StaticRepository.listEmployee.isEmpty()) {
            m.setId(StaticRepository.listEmployee.get(StaticRepository.listEmployee.size() - 1).getId() + 1);
        }
        StaticRepository.listEmployee.add(m);
    }

    @Override
    public void update(Employee m) {
        for (int i = 0; i < StaticRepository.listEmployee.size(); i++) {
            if (StaticRepository.listEmployee.get(i).getId() == m.getId()) {
                StaticRepository.listEmployee.set(i, m);
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < StaticRepository.listEmployee.size(); i++) {
            if (StaticRepository.listEmployee.get(i).getId() == id) {
                StaticRepository.listEmployee.remove(i);
            }
        }
    }

}
