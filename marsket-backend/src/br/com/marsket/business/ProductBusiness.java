package br.com.marsket.business;

import br.com.marsket.model.Product;
import br.com.marsket.repository.ProductRepository;
import br.com.marsket.repository.StaticRepository;
import java.util.LinkedList;

public class ProductBusiness {

    public LinkedList<Product> getProducts() {
        return new ProductRepository().getAll();
    }

    public Product getProduct(int id) {
        return new ProductRepository().getObject(id);
    }

    public Product getProductSale(String barCode, int quantity) {
        for (Product prod : getProducts()) {
            if (prod.getBarCode().equals(barCode)) {
                prod.setQuantity(quantity);
                return prod;
            }
        }
        return null;
    }

    public void insertProduct(Product product) {
        for (Product prod : StaticRepository.listProduct) {
            if (prod.getBarCode().equals(product.getBarCode())) {
                prod.setQuantity(prod.getQuantity() + product.getQuantity());
                return;
            }
        }
        new ProductRepository().insert(product);
    }

    public void updateProduct(Product products) {
        new ProductRepository().update(products);
    }

    public void removeProduct(int id) {
        new ProductRepository().delete(id);
    }
}
