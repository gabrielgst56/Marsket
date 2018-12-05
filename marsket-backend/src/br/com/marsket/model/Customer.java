package br.com.marsket.model;

public class Customer extends People {

    private int id;
    private boolean haveDiscount;

    public Customer() {
    }

    public Customer(int id, boolean haveDiscount, String firstName, String lastName, String cpf) {
        super(firstName, lastName, cpf);
        this.haveDiscount = haveDiscount;
        this.id = id;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", haveDiscount=" + haveDiscount + '}';
    }

}
