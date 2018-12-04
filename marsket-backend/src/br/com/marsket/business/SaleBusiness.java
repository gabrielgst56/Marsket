package br.com.marsket.business;

import br.com.marsket.model.Product;
import br.com.marsket.model.Sale;

public class SaleBusiness {

	public Sale AddSale(Sale sale) {
		
		double valorTotal = 0;
		
		for(Product product : sale.getProducts()) {
			
			ProductBusiness prodBusiness = new ProductBusiness();
			Product productEdit = prodBusiness.getProduct(product.getId());
			
			if(sale.getCustomer().isHaveDiscount() && product.isHaveDiscount()) {
				
				//Caso o cliente e o produto esteja com a flag de desconto, adiciona 10% de desconto ao valor
				
				valorTotal = valorTotal + ((product.getQuantity() * product.getPrice()) * 0.9);
				
			}else {
				valorTotal = valorTotal + (product.getQuantity() * product.getPrice());
			}
			
			productEdit.setQuantity(productEdit.getQuantity() - product.getQuantity());
			
			prodBusiness.updateProduct(productEdit);
			
		}
		
		sale.setTotal(valorTotal);
		
		return sale;
		
	}

}
