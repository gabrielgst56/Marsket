package br.com.marsket.test;

import br.com.marsket.controller.CustomerController;
import br.com.marsket.controller.EmployeeController;
import br.com.marsket.repository.StaticRepository;

public class MainCustomer {

    public static void main(String[] args) {

        new CustomerController().addCustomer(StaticRepository.listCustomer.get(1));

        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        new EmployeeController().addEmployees(StaticRepository.listEmployee.get(1));
        System.out.println("\n");

        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        System.out.println(new EmployeeController().getEmployees().getEntity().toString());

        System.out.println("Test");
    }

}
