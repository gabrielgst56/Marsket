package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import java.util.LinkedList;

/**
*
* @author Renan Campregher
*/
public class CustomerRepository implements BaseRepository<Customer> {

    @Override
    public LinkedList<Customer> getAll() {
        return StaticRepository.listCustomer;
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
    public void insert(Customer m) {
    	if (!StaticRepository.listCustomer.isEmpty()) {
            m.setId(StaticRepository.listCustomer.getLast().getId() + 1);
        } else {
            m.setId(0);
        }
        StaticRepository.listCustomer.add(m);
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
