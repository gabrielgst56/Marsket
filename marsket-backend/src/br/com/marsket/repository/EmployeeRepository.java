package br.com.marsket.repository;

import br.com.marsket.model.Employee;
import java.util.LinkedList;

public class EmployeeRepository implements BaseRepository<Employee> {

    private LinkedList<Employee> listEmployee;

    public EmployeeRepository() {
        if (StaticRepository.initialize == false) {
            StaticRepository.initList();
        }
        listEmployee = new LinkedList<>();
        StaticRepository.listEmployee.forEach((employee) -> {
            listEmployee.add(employee);
        });
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
