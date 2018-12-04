package br.com.marsket.business;

import br.com.marsket.model.Product;
import br.com.marsket.model.Sale;
import br.com.marsket.repository.ProductRepository;

public class SaleBusiness {

	public Sale AddSale(Sale sale) {
		
		double valorTotal = 0;
		ProductRepository productRepository = new ProductRepository();
		
		for(Product product : sale.getProducts()) {
			if(sale.getCustomer().isHaveDiscount() == true 
					&& product.isHaveDiscount() == true) {
				//Caso o cliente e o produto esteja com a flag de desconto, adiciona 10% de desconto ao valor
				valorTotal = valorTotal + ((product.getQuantity() * product.getPrice()) * 0.9);
			}else {
				valorTotal = valorTotal + (product.getQuantity() * product.getPrice());
			}
		}
		
		sale.setTotal(valorTotal);
		
		System.out.println(valorTotal);
		
		return sale;
		
		//new SaleRepository().insert(sale);
		
	}

}
