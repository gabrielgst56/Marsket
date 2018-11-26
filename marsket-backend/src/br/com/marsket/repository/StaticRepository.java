package br.com.marsket.repository;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.marsket.model.Custommer;
import br.com.marsket.model.Employee;
import br.com.marsket.model.Product;
import br.com.marsket.model.User;

public class StaticRepository {

	static ArrayList<User> listUser;

	static ArrayList<Custommer> listCustomer;

	static ArrayList<Employee> listEmployee;

	static ArrayList<Product> listProduct;
	
	public static void Init() {
		listCustomer = new ArrayList<>();
		listEmployee = new ArrayList<>();
		listProduct = new ArrayList<>();
		
	}
}
