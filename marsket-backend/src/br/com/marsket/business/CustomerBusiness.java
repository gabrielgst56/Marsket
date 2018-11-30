package br.com.marsket.business;

import br.com.marsket.model.Customer;
import br.com.marsket.repository.CustomerRepository;
import java.util.LinkedList;

public class CustomerBusiness {


    public LinkedList<Customer> getCustomers() {
        return new CustomerRepository().getAll();
    }

    public Customer getCustomer(int id) {
        return new CustomerRepository().getObject(id);
    }

    public void AddCustomer(Customer customer) {
        new CustomerRepository().insert(customer);
    }

    public void updateCustomer(Customer customer) {
        new CustomerRepository().update(customer);
    }

    public void removeCustomer(int id) {
        new CustomerRepository().delete(id);
    }
}
