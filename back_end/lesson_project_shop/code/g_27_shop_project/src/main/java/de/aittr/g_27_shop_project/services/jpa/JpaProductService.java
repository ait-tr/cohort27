package de.aittr.g_27_shop_project.services.jpa;

import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.jpa.JpaProductRepository;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaProductService implements ProductService {

    private JpaProductRepository repository;

    public JpaProductService(JpaProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllActiveProducts() {
        return null;
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