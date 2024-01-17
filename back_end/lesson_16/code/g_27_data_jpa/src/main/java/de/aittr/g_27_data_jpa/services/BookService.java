package de.aittr.g_27_data_jpa.services;

import de.aittr.g_27_data_jpa.domain.Book;
import de.aittr.g_27_data_jpa.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Book add(Book book) {
        book.setId(0);
        return repository.save(book);
    }

    public Book update(Book book) {
        return repository.save(book);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void deleteByName(String name) {
        repository.deleteByName(name);
    }

    public int getAverageYear() {
        return repository.getAverageYear();
    }
}