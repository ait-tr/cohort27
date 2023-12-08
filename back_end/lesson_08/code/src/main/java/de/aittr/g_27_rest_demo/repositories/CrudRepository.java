package de.aittr.g_27_rest_demo.repositories;

import java.util.List;

public interface CrudRepository<T> {

    T save(T obj);

    T getById(int id);

    List<T> getAll();

    void deleteById(int id);
}