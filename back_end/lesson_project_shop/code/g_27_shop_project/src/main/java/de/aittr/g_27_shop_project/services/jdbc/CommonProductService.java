package de.aittr.g_27_shop_project.services.jdbc;

import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.interfaces.ProductRepository;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

//@Service
public class CommonProductService implements ProductService {

    private ProductRepository repository;

    public CommonProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {

        if (product == null) {
            throw new IllegalArgumentException("Сохраняемый продукт не может быть null.");
        }

        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Имя сохраняемого продукта не может быть пустым.");
        }

        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Цена сохраняемого продукта не может быть отрицательной либо равной нулю.");
        }

        return repository.save(product);
    }

    @Override
    public List<Product> getAllActiveProducts() {
        List<Product> products = repository.getAll();

        if (products.isEmpty()) {
            throw new NoSuchElementException("В базе данных нет продуктов");
        }

        return products;
    }

    @Override
    public Product getActiveProductById(int id) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public void restoreById(int id) {

    }

    @Override
    public int getActiveProductsCount() {
        return 0;
    }

    @Override
    public double getActiveProductsTotalPrice() {
        return 0;
    }

    @Override
    public double getActiveProductsAveragePrice() {
        return 0;
    }
}