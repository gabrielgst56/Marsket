package br.com.marsket.repository;

import java.util.ArrayList;

public interface BaseRepository<Model> {

	ArrayList<Model> getAll();
	
	Model getObject(int id);
	
	boolean insert(Model m);

	boolean update(Model m);

	boolean delete(int id);
}
