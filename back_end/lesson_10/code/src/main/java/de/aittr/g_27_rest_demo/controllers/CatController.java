package de.aittr.g_27_rest_demo.controllers;

import de.aittr.g_27_rest_demo.domain.Cat;
import de.aittr.g_27_rest_demo.domain.SimpleCat;
import de.aittr.g_27_rest_demo.services.CatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

    private CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    // http://12.45.67.89:8080/cats/all -> GET

    @GetMapping("/all")
    public List<Cat> getAll() {
        return service.getAll();
    }

    // http://12.34.56.78:8080/cats/save -> POST

    @PostMapping("/save")
    public Cat save(@RequestBody SimpleCat cat) {
        return service.save(cat);
    }

    // http://12.34.56.67:8080/cats/get_by_id/5

//    @GetMapping("/get_by_id/{id}")
//    public Cat getById(@PathVariable int id) {
//        return service.getById(id);
//    }

    // http://12.34.56.67:8080/cats/get_by_id?id=5

    @GetMapping("/get_by_id")
    public Cat getById(@RequestParam int id) {
        return service.getById(id);
    }
}