package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import br.com.marsket.model.Product;

import java.util.LinkedList;

public class CustomerRepository implements BaseRepository<Customer> {

	public LinkedList<Customer> Customers;

    public CustomerRepository() {
        Customers = new LinkedList<>();
        Customers.add(new Customer(0, true, "Gabriel", "Augusto", "12345678950"));
        Customers.add(new Customer(1, true, "Pedro", "Henrique", "12345678950"));
        Customers.add(new Customer(2, true, "Renna", "Campregher", "12345678950"));
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
    	this.Customers.add(customer);
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
