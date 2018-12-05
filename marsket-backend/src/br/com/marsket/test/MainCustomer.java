package br.com.marsket.test;
import br.com.marsket.business.CustomerBusiness;
import br.com.marsket.controller.CustomerController;
import br.com.marsket.controller.ProductController;
import br.com.marsket.controller.SaleController;
import br.com.marsket.model.Customer;
import br.com.marsket.model.Employee;
import br.com.marsket.model.Product;
import br.com.marsket.model.Sale;
import br.com.marsket.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.ws.rs.core.Response;
import br.com.marsket.repository.StaticRepository;
import br.com.marsket.util.UserTypeEnum;

public class MainCustomer {

    public static void main(String[] args) {

   /*     StaticRepository.listEmployee.forEach((c) -> {
            System.out.println(c.getId() + " " + c.getFirstName());
        });
    	

    	CustomerRepository repositorio = new CustomerRepository();
    	
    	LinkedList<Customer> customers  =  repositorio.getAll();
    	for(Customer customer : customers) {
    		System.out.println(customer.getFirstName());
    	}
    	repositorio.delete(2);
    	System.out.println("---");
    	
    	CustomerRepository repositorio2 = new CustomerRepository();
    	customers  =  repositorio2.getAll();
    	for(Customer customer : customers) {
    		System.out.println(customer.getFirstName());
    	}*/
    	
    	//CustomerController control = new CustomerController();
    	//Response re = control.getCustomers();
    	//ProductController control2 = new ProductController();
    	//control2.getProducts();
    	//Response re = control.getProducts();
    	
    	//System.out.println(re);
    	
    	Customer customer = new Customer(4, true, "Thomas Erick", "Joaquim Farias", "63277321436");
    	CustomerBusiness ctrC = new CustomerBusiness();
    	LinkedList<Customer> customers = ctrC.getCustomers();
    	ctrC.AddCustomer(customer);
    	customers = ctrC.getCustomers();
    	
    	
    	
    	ArrayList<Product> lst = new ArrayList<>();
    	Product produto = new Product (1, "12312156", "Porca de 10cm", 10.00, 2, false);
    	lst.add(produto);
    	Employee employee = new Employee(1, 1000.00, "Vicente", "Antonio das Neves", "27788607380");
    	Sale sale = new Sale(customer, lst, employee, 0);
    	SaleController controle = new SaleController();
    	Response re = controle.addSale(sale);
    	
    	ProductController control2 = new ProductController();
    	Response re2 = control2.getProduct(1);
    	
    }

}
