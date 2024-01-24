package de.aittr.g_27_shop_project.services.interfaces;

import de.aittr.g_27_shop_project.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto save(ProductDto product);

    List<ProductDto> getAllActiveProducts();

    ProductDto getActiveProductById(int id);

    void update(ProductDto product);

    void deleteById(int id);

    void deleteByName(String name);

    void restoreById(int id);

    int getActiveProductsCount();

    double getActiveProductsTotalPrice();

    double getActiveProductsAveragePrice();
}