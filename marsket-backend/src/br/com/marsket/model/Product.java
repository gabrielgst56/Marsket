package br.com.marsket.model;

public class Product {

    private int id;
    private String barCode;
    private String name;
    private Double price;
    private int quantity;
    private boolean haveDiscount;

    public Product() {
    }

    public Product(int id, String barCode, String name, Double price, int quantity, boolean haveDiscount) {
        this.id = id;
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.haveDiscount = haveDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        this.haveDiscount = haveDiscount;
    }

    public boolean isHaveDiscount() {
        return haveDiscount;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", barCode=" + barCode + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", haveDiscount=" + haveDiscount + '}';
    }

}
