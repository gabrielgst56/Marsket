package br.com.marsket.test;

import br.com.marsket.repository.StaticRepository;

public class MainCustomer {

    public static void main(String[] args) {

        StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });

    }

}
