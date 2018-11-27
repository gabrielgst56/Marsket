package br.com.marsket.repository;

import java.util.ArrayList;

import br.com.marsket.model.Customer;
import br.com.marsket.model.Employee;
import br.com.marsket.model.Product;
import br.com.marsket.model.User;
import br.com.marsket.util.UserTypeEnum;

public class StaticRepository {

    public static ArrayList<User> listUser = new ArrayList<User>() {
        {
            add(new User("renan", "123", UserTypeEnum.ADMIN));
            add(new User("pedro", "123", UserTypeEnum.ADMIN));
            add(new User("gabriel", "123", UserTypeEnum.ADMIN));
        }
    };

    public static ArrayList<Customer> listCustomer = new ArrayList<Customer>() {
        {
            add(new Customer(modCount, true, "Thomas Erick", "Joaquim Farias", "63277321436"));
            add(new Customer(modCount, false, "Vinicius Arthur", "Pedro Barros", "08108139554"));
            add(new Customer(modCount, true, "Severino Geraldo", "Fábio Gonçalves", "21047352036"));
        }
    };

    public static ArrayList<Employee> listEmployee = new ArrayList<Employee>() {
        {
            add(new Employee(modCount, 1000.00, "Vicente", "Antonio das Neves", "27788607380"));
            add(new Employee(modCount, 1500.00, "Eduardo", "Julio Vieira", "46941215291"));
            add(new Employee(modCount, 2000.00, "Miguel", "Anthony da Conceição", "26063487298"));
        }
    };

    public static ArrayList<Product> listProduct = new ArrayList<Product>() {
        {
            add(new Product(modCount, "12312156", "Porca de 10cm", 10.00, 10, false));
            add(new Product(modCount, "12421421", "Farinha", 10.99, 10, true));
            add(new Product(modCount, "21345234", "Óleo", 12.99, 15, true));
            add(new Product(modCount, "42424246", "Macarrao", 12.99, 15, true));
        }
    };
}
