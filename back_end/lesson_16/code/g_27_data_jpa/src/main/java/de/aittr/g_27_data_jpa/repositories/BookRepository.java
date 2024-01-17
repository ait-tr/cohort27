package de.aittr.g_27_data_jpa.repositories;

import de.aittr.g_27_data_jpa.domain.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Transactional
    void deleteByName(String name);

    @Query(value = "select avg(year) from book;", nativeQuery = true)
    int getAverageYear();
}