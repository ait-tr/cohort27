package de.aittr.g_27_security.controllers;

import de.aittr.g_27_security.domain.Car;
import de.aittr.g_27_security.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Car> getAll() {
        return service.getAll();
    }

    @GetMapping("/by_id/{id}")
    public Car getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping("/save")
    public Car save(@RequestBody Car car) {
        return service.save(car);
    }
}