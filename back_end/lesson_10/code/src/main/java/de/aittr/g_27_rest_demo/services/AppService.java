package de.aittr.g_27_rest_demo.services;

import java.util.List;

public interface AppService<T> {

    T save(T obj);

    T getById(int id);

    List<T> getAll();

    void deleteById(int id);
}