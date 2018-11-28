package br.com.marsket.repository;

import java.util.LinkedList;

public interface BaseRepository<Model> {

    LinkedList<Model> getAll();

    Model getObject(int id);

    void insert(Model m);

    void update(Model m);

    void delete(int id);
}
