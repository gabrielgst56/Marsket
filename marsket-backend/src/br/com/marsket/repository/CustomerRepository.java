package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import java.util.LinkedList;

public class CustomerRepository implements BaseRepository<Customer> {

	private LinkedList<Customer> Customers;
	
    public CustomerRepository() {
    	if(StaticRepository.initialize == false) {
    		StaticRepository.initList();
    		System.out.println("Euuu");
    	}
    	
    	Customers = new LinkedList<>();
        for(Customer customer : StaticRepository.listCustomer) {
            Customers.add(customer);
        }
    }
    
    @Override
    public LinkedList<Customer> getAll() {
        return this.Customers;
    }

    @Override
    public Customer getObject(int id) {
    	for (Customer customer : StaticRepository.listCustomer) {
            if (customer.getId() == id) {
                return customer ;
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
