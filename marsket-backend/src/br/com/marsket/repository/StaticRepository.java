package br.com.marsket.repository;

import br.com.marsket.model.Customer;
import br.com.marsket.model.Employee;
import br.com.marsket.model.Product;
import br.com.marsket.model.User;
import br.com.marsket.util.UserTypeEnum;
import java.util.LinkedList;

public class StaticRepository {

    public static LinkedList<User> listUser;
    public static LinkedList<Customer> listCustomer;
    public static LinkedList<Employee> listEmployee;
    public static LinkedList<Product> listProduct;

    static {

        listUser = new LinkedList<User>() {
            {
                add(new User("renan", "123", UserTypeEnum.ADMIN));
                add(new User("pedro", "123", UserTypeEnum.ADMIN));
                add(new User("gabriel", "123", UserTypeEnum.ADMIN));
            }
        };

        listCustomer = new LinkedList<Customer>() {
            {
                add(new Customer(true, "Thomas Erick", "Joaquim Farias", "63277321436"));
                add(new Customer(false, "Vinicius Arthur", "Pedro Barros", "08108139554"));
                add(new Customer(true, "Severino Geraldo", "Fábio Gonçalves", "21047352036"));
            }
        };

        listEmployee = new LinkedList<Employee>() {
            {
                add(new Employee(modCount, 1000.00, "Vicente", "Antonio das Neves", "27788607380"));
                add(new Employee(modCount, 1500.00, "Eduardo", "Julio Vieira", "46941215291"));
                add(new Employee(modCount, 2000.00, "Miguel", "Anthony da Conceição", "26063487298"));
            }
        };

        listProduct = new LinkedList<Product>() {
            {
                add(new Product(modCount, "12312156", "Porca de 10cm", 10.00, 10, false));
                add(new Product(modCount, "12421421", "Farinha", 10.99, 10, true));
                add(new Product(modCount, "21345234", "Óleo", 12.99, 15, true));
                add(new Product(modCount, "42424246", "Macarrao", 12.99, 15, true));
            }
        };
    }

}
