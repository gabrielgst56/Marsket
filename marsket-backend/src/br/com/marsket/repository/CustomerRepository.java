package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import java.util.LinkedList;

public class CustomerRepository implements BaseRepository<Customer> {

    @Override
    public LinkedList<Customer> getAll() {
        return StaticRepository.listCustomer;
    }

    @Override
    public Customer getObject(int id) {
        for (Customer customer : StaticRepository.listCustomer) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void insert(Customer m) {
        // Another way is to use a for each in the list to get the biggest id then sum +1 to add the new customer
        if (!StaticRepository.listCustomer.isEmpty()) {
            int id = StaticRepository.listCustomer.get(StaticRepository.listCustomer.size() - 1).getId();
            m.setId(id + 1);
        }
        StaticRepository.listCustomer.add(m);
    }

    @Override
    public void update(Customer m) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    }

}
