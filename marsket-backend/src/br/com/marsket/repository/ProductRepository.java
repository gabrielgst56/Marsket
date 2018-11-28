package br.com.marsket.repository;

import br.com.marsket.model.Product;
import java.util.LinkedList;

public class ProductRepository implements BaseRepository<Product> {

    public LinkedList<Product> Products;

    public ProductRepository() {

        Products = new LinkedList<>();

        Products.add(new Product(0, "12421421", "Farinha", 10.99, 10, true));
        Products.add(new Product(1, "21345234", "Óleo", 12.99, 15, true));
        Products.add(new Product(2, "42424246", "Macarrao", 12.99, 15, true));

    }

    @Override
    public LinkedList<Product> getAll() {

        return this.Products;
    }

    @Override
    public Product getObject(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Product m) {
        // TODO Auto-generated method stub
    }

    @Override
    public void update(Product m) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    }

}
