package br.com.marsket.repository;

import java.util.LinkedList;

import br.com.marsket.model.Sale;

public class SaleRepository implements BaseRepository<Sale>{

	@Override
	public LinkedList<Sale> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Sale m) {
		//Não tem insert pelo fato de nao termos um repositorio de Sale
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sale m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
