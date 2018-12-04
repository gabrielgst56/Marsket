package br.com.marsket.repository;

import br.com.marsket.model.Product;
import java.util.LinkedList;

public class ProductRepository implements BaseRepository<Product> {

	private LinkedList<Product> Products;

    public ProductRepository() {
    	if(StaticRepository.initialize == false) {
    		StaticRepository.initList();
    	}
    	
    	Products = new LinkedList<>();
        for(Product product : StaticRepository.listProduct) {
        	Products.add(product);
        }
    	
    }

    @Override
    public LinkedList<Product> getAll() {
        return this.Products;
    }

    @Override
    public Product getObject(int id) {
        for (Product product : StaticRepository.listProduct) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void insert(Product m) {
        if (!StaticRepository.listProduct.isEmpty()) {
            m.setId(StaticRepository.listProduct.getLast().getId() + 1);
        } else {
            m.setId(0);
        }
        StaticRepository.listProduct.add(m);
    }

    @Override
    public void update(Product m) {
        for (int i = 0; i < StaticRepository.listProduct.size(); i++) {
            if (StaticRepository.listProduct.get(i).getId() == m.getId()) {
                StaticRepository.listProduct.set(i, m);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < StaticRepository.listProduct.size(); i++) {
            if (StaticRepository.listProduct.get(i).getId() == id) {
                StaticRepository.listProduct.remove(i);
                break;
            }
        }
    }
    
    //Não tenho certeza se o método ficaria aqui na repository ou na ProductBusiness
    public void setQuantity(int id, int quantity) {
    	 for (Product product : StaticRepository.listProduct) {
             if (product.getId() == id) {
                 product.setQuantity(product.getQuantity() - quantity);
             }
         }
    }
}
