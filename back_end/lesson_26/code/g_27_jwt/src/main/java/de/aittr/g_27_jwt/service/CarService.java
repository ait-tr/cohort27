package de.aittr.g_27_jwt.service;

import de.aittr.g_27_jwt.domain.entity.Car;
import de.aittr.g_27_jwt.repository.CarRepository;
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
}