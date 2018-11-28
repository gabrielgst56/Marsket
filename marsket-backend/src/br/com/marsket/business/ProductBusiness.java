package br.com.marsket.business;

import br.com.marsket.model.Product;
import br.com.marsket.repository.ProductRepository;
import java.util.LinkedList;

public class ProductBusiness {

    public LinkedList<Product> getProducts() {

        return new ProductRepository().getAll();
    }
}
