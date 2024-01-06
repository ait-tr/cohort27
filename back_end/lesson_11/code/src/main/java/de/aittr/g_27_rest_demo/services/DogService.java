package de.aittr.g_27_rest_demo.services;

import de.aittr.g_27_rest_demo.domain.Dog;
import de.aittr.g_27_rest_demo.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService implements AppService<Dog> {

    private DogRepository repository;

    public DogService(DogRepository repository) {
        this.repository = repository;
    }

    @Override
    public Dog save(Dog obj) {
        return null;
    }

    @Override
    public Dog getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Dog> getAll() {
        return repository.getAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}