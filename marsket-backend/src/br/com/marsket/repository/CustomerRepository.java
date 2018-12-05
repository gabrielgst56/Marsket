package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import java.util.LinkedList;

public class CustomerRepository implements BaseRepository<Customer> {

    private LinkedList<Customer> listCustomers;

    public CustomerRepository() {
        if (StaticRepository.initialize == false) {
            StaticRepository.initList();
        }
        listCustomers = new LinkedList<>();
        StaticRepository.listCustomer.forEach((customer) -> {
            listCustomers.add(customer);
        });
    }

    @Override
    public LinkedList<Customer> getAll() {
        return this.listCustomers;
    }

    @Override
    public Customer getObject(int id) {
        for (Customer customer : listCustomers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void insert(Customer customer) {
        if (!StaticRepository.listCustomer.isEmpty()) {
            customer.setId(StaticRepository.listCustomer.getLast().getId() + 1);
        } else {
            customer.setId(0);
        }
        StaticRepository.listCustomer.add(customer);
    }

    @Override
    public void update(Customer m) {
        for (int i = 0; i < StaticRepository.listCustomer.size(); i++) {
            if (StaticRepository.listCustomer.get(i).getId() == m.getId()) {
                StaticRepository.listCustomer.set(i, m);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < StaticRepository.listCustomer.size(); i++) {
            if (StaticRepository.listCustomer.get(i).getId() == id) {
                StaticRepository.listCustomer.remove(i);
                break;
            }
        }
    }

}
