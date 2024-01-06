package de.aittr.g_27_rest_demo.controllers;

import de.aittr.g_27_rest_demo.domain.Dog;
import de.aittr.g_27_rest_demo.services.DogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    private DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Dog getById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Dog> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
}