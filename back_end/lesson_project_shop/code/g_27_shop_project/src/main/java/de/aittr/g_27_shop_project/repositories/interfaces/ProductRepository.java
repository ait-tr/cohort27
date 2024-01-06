package de.aittr.g_27_shop_project.repositories.interfaces;

import de.aittr.g_27_shop_project.domain.interfaces.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    List<Product> getAll();

    Product getById(int id);

    Product update(Product product);

    void deleteById(int id);
}