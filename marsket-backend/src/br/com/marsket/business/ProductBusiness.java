package br.com.marsket.business;

import java.util.ArrayList;

import br.com.marsket.model.Product;
import br.com.marsket.repository.ProductRepository;

public class ProductBusiness {

    public ArrayList<Product> getProducts() {

        return new ProductRepository().getAll();
    }
}
