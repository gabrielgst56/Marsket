package br.com.marsket.business;

import br.com.marsket.model.Customer;
import br.com.marsket.repository.CustomerRepository;
import java.util.LinkedList;

public class CustomerBusiness {

    public void AddCustomer(Customer customer) {
        new CustomerRepository().insert(customer);
    }

    public LinkedList<Customer> getCustomers() {
        return new CustomerRepository().getAll();
    }
}
