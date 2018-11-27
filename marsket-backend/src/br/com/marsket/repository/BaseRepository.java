package br.com.marsket.repository;

import java.util.ArrayList;

public interface BaseRepository<Model> {

	ArrayList<Model> getAll();
	
	Model getObject(int id);
	
	void insert(Model m);

	void update(Model m);

	void delete(int id);
}
