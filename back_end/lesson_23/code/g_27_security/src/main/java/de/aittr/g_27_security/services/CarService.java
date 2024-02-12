package de.aittr.g_27_security.services;

import de.aittr.g_27_security.domain.Car;
import de.aittr.g_27_security.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAll() {
        return repository.findAll();
    }

    public Car getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Car save(Car car) {
        return repository.save(car);
    }
}