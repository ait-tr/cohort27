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
}