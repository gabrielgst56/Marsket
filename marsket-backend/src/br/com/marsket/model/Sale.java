package br.com.marsket.model;

import java.util.ArrayList;

public class Sale {

    private double total;
    private Customer customer;
    private Employee employee;
    private ArrayList<Product> products;

    public Sale() {
    }

    public Sale(Customer customer, ArrayList<Product> products, Employee employee, double total) {
        this.customer = customer;
        this.products = products;
        this.employee = employee;
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sale [customer=" + customer + ", products=" + products + ", employee=" + employee + ", total=" + total
                + "]";
    }
}
