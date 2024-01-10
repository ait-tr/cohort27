package de.aittr.g_27_shop_project.services.interfaces;

import de.aittr.g_27_shop_project.domain.interfaces.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> getAllActiveProducts();

    Product getActiveProductById(int id);

    void update(Product product);

    void deleteById(int id);

    void deleteByName(String name);

    void restoreById(int id);

    int getActiveProductsCount();

    double getActiveProductsTotalPrice();

    double getActiveProductsAveragePrice();
}