package de.aittr.g_27_rest_demo.services;

import de.aittr.g_27_rest_demo.domain.Cat;
import de.aittr.g_27_rest_demo.repositories.CatRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService implements AppService<Cat> {

    private CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cat save(Cat obj) {
        return repository.save(obj);
    }

    @Override
    public Cat getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Cat> getAll() {
        return new ArrayList<>(repository.getAll());
    }

    @Override
    public void deleteById(int id) {

    }
}