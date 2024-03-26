package de.aittr.g_27_jwt.controller;

import de.aittr.g_27_jwt.domain.entity.Car;
import de.aittr.g_27_jwt.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAll() {
        return service.getAll();
    }
}