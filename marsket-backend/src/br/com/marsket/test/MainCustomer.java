package br.com.marsket.test;

import br.com.marsket.controller.EmployeeController;
import br.com.marsket.repository.StaticRepository;
import com.google.gson.Gson;

public class MainCustomer {

    public static void main(String[] args) {

        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        System.out.println("\n<");
        System.out.println(new EmployeeController().addEmployees(new Gson().toJson(StaticRepository.listEmployee.get(1))).getEntity());
        System.out.println(">\n");
        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        System.out.println("\n<");
        StaticRepository.listEmployee.get(1).setFirstName("Jason");
        System.out.println(new EmployeeController().attEmployees(new Gson().toJson(StaticRepository.listEmployee.get(1))).getEntity());
        System.out.println(">\n");
        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        System.out.println("\n<");
        System.out.println(new EmployeeController().delEmployees(1).getStatus());
        System.out.println(">\n");
        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

        System.out.println("\n");
        System.out.println(new EmployeeController().getEmployee(2).getEntity());

        System.out.println("\n");
        System.out.println(new EmployeeController().getAllEmployees());

        System.out.println("\n");
    }

}
