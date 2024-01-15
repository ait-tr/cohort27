package de.aittr.g_27_data_jpa.repositories;

import de.aittr.g_27_data_jpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}