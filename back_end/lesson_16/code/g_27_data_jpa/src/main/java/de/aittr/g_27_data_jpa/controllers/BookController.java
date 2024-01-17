package de.aittr.g_27_data_jpa.controllers;

import de.aittr.g_27_data_jpa.domain.Book;
import de.aittr.g_27_data_jpa.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAll();
    }

    // localhost:8080/books/3
    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return service.add(book);
    }

    @PutMapping
    public Book update(@RequestBody Book book) {
        return service.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/name/{name}")
    public void deleteByName(@PathVariable String name) {
        service.deleteByName(name);
    }

    @GetMapping("/avg_year")
    public int getAverageYear() {
        return service.getAverageYear();
    }
}