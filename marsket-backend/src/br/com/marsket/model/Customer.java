package br.com.marsket.model;

public class Customer extends People {

    private int id;
    private boolean haveDiscount;

    public Customer(int id, boolean haveDiscount, String firstName, String lastName, String cpf) {
        super(firstName, lastName, cpf);
        this.id = id;
        this.haveDiscount = haveDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", haveDiscount=" + haveDiscount + '}';
    }

}
