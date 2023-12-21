package de.aittr.g_27_shop_project.domain.interfaces;

import java.util.List;

public interface Cart {

    int getId();

    List<Product> getProducts();

    void addProduct(Product product);

    void deleteProductById(int productId);

    void clear();

    double getTotalPrice();

    double getAveragePrice();
}