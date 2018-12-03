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

    private LinkedList<Employee> listEmployee;

    public EmployeeRepository() {
        if (StaticRepository.initialize == false) {
            StaticRepository.initList();
            System.out.println("Euuu");
        }

        listEmployee = new LinkedList<>();
        for (Employee employee : StaticRepository.listEmployee) {
            listEmployee.add(employee);
        }
    }

    @Override
    public LinkedList<Employee> getAll() {
        return listEmployee;
    }

    @Override
    public Employee getObject(int id) {
        for (Employee employee : listEmployee) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void insert(Employee m) {
        if (!StaticRepository.listEmployee.isEmpty()) {
            m.setId(StaticRepository.listEmployee.getLast().getId() + 1);
        } else {
            m.setId(0);
        }
        StaticRepository.listEmployee.add(m);
    }

    @Override
    public void update(Employee m) {
        for (int i = 0; i < StaticRepository.listEmployee.size(); i++) {
            if (StaticRepository.listEmployee.get(i).getId() == m.getId()) {
                StaticRepository.listEmployee.set(i, m);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < StaticRepository.listEmployee.size(); i++) {
            if (StaticRepository.listEmployee.get(i).getId() == id) {
                StaticRepository.listEmployee.remove(i);
                break;
            }
        }
    }

}
