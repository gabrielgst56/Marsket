package br.com.marsket.model;

public class Employee extends People {

    private int id;
    private Double salary;

    public Employee(int id, Double salary, String firstName, String lastName, String cpf) {
        super(firstName, lastName, cpf);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + '}';
    }

}
