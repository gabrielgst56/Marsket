package br.com.marsket.business;

import br.com.marsket.model.Product;
import br.com.marsket.repository.ProductRepository;
import java.util.LinkedList;

public class ProductBusiness {

    public LinkedList<Product> getProducts() {
        return new ProductRepository().getAll();
    }

    public Product getProduct(int id) {
        return new ProductRepository().getObject(id);
    }

    public void insertProduct(Product products) {
        new ProductRepository().insert(products);
    }

    public void updateProduct(Product products) {
        new ProductRepository().update(products);
    }

    public void removeProduct(int id) {
        new ProductRepository().delete(id);
    }
}
